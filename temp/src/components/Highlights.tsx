import { useEffect, useState } from "react";
import {
  Typography,
  List,
  ListItem,
  ListItemText,
  CircularProgress,
  Dialog,
  DialogTitle,
  DialogContent,
  IconButton,
} from "@mui/material";
import CloseIcon from "@mui/icons-material/Close";

interface HighlightMeta {
  filename: string;
  title: string;
}

export default function Highlights() {
  const [highlights, setHighlights] = useState<HighlightMeta[]>([]);
  const [loading, setLoading] = useState(true);
  const [selected, setSelected] = useState<any | null>(null);
  const [open, setOpen] = useState(false);

  useEffect(() => {
    const files = [
      "added_sugar.json",
      "alcohol.json",
      "balanced_macros.json",
      "caffeine.json",
      "complex_carbs.json",
      "diverse_in_nutrition.json",
      "diverse_protein.json",
      "greens_booster.json",
      "healthy_fats.json",
      "high_in_salt.json",
      "lack_of_greens.json",
      "low_in_protein.json",
      "natural.json",
      "possible_trans_fats.json",
      "processed_foods.json",
      "processed_meat.json",
      "protein_rich.json",
      "refined_carbs.json",
      "refined_grains.json",
      "rich_in_fiber.json",
      "rich_in_vitamins_and_minerals.json",
      "satured_fats.json",
    ];
    Promise.all(
      files.map(async (filename) => {
        const res = await fetch(`/assets/highlights/${filename}`);
        const json = await res.json();
        return { filename, title: json.title };
      })
    )
      .then(setHighlights)
      .finally(() => setLoading(false));
  }, []);

  const handleOpen = async (filename: string) => {
    const res = await fetch(`/assets/highlights/${filename}`);
    const json = await res.json();
    setSelected(json);
    setOpen(true);
  };

  return (
    <div>
      <Typography variant="h4" gutterBottom>
        Nutrition Highlights
      </Typography>
      {loading ? (
        <CircularProgress />
      ) : (
        <List>
          {highlights.map((h) => (
            <ListItem
              button
              key={h.filename}
              onClick={() => handleOpen(h.filename)}
            >
              <ListItemText primary={h.title} secondary={h.filename} />
            </ListItem>
          ))}
        </List>
      )}
      <Dialog
        open={open}
        onClose={() => setOpen(false)}
        maxWidth="md"
        fullWidth
      >
        <DialogTitle>
          {selected?.title}
          <IconButton
            aria-label="close"
            onClick={() => setOpen(false)}
            sx={{ position: "absolute", right: 8, top: 8 }}
          >
            <CloseIcon />
          </IconButton>
        </DialogTitle>
        <DialogContent dividers>
          {selected?.screens?.map((screen: any, idx: number) => (
            <div key={idx} style={{ marginBottom: 24 }}>
              {screen.content?.map((block: any, i: number) => {
                if (block.type === "richtext") {
                  return (
                    <Typography key={i} paragraph>
                      {block.items.map((item: any) => item.text).join("")}
                    </Typography>
                  );
                }
                if (block.type === "list" || block.type === "checklist") {
                  return (
                    <ul key={i}>
                      {block.items.map((li: any, j: number) => (
                        <li key={j}>
                          {li.items.map((item: any) => item.text).join("")}
                        </li>
                      ))}
                    </ul>
                  );
                }
                return null;
              })}
              {screen.link && (
                <Typography variant="body2" color="primary">
                  <a
                    href={screen.link.url}
                    target="_blank"
                    rel="noopener noreferrer"
                  >
                    {screen.link.title}
                  </a>
                </Typography>
              )}
            </div>
          ))}
        </DialogContent>
      </Dialog>
    </div>
  );
}
