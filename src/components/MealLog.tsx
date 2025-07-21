import { useState, useEffect } from "react";
import {
  Typography,
  TextField,
  Button,
  List,
  ListItem,
  ListItemText,
  Box,
  Alert,
  CircularProgress,
} from "@mui/material";
import { useAuth } from "../contexts/AuthContext";
import axios from "axios";

interface Meal {
  id: number;
  meal_data: any;
  created_at: string;
}

export default function MealLog() {
  const { user } = useAuth();
  const [meal, setMeal] = useState("");
  const [meals, setMeals] = useState<Meal[]>([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const fetchMeals = async () => {
    if (!user) return;
    setLoading(true);
    setError(null);
    try {
      const res = await axios.get(
        `http://localhost:3000/meal/history/${user.id}`
      );
      setMeals(res.data);
    } catch (err: any) {
      setError("Failed to fetch meals");
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchMeals();
    // eslint-disable-next-line
  }, [user]);

  const handleLog = async () => {
    if (!meal.trim() || !user) return;
    setLoading(true);
    setError(null);
    try {
      await axios.post("http://localhost:3000/meal/log", {
        user_id: user.id,
        meal_data: { text: meal },
      });
      setMeal("");
      fetchMeals();
    } catch (err: any) {
      setError("Failed to log meal");
    } finally {
      setLoading(false);
    }
  };

  if (!user) {
    return (
      <Alert severity="info">Please log in to view and log your meals.</Alert>
    );
  }

  return (
    <Box>
      <Typography variant="h4" gutterBottom>
        Meal Log
      </Typography>
      <TextField
        label="Describe your meal"
        multiline
        rows={3}
        value={meal}
        onChange={(e) => setMeal(e.target.value)}
        fullWidth
        margin="normal"
      />
      <Button
        variant="contained"
        onClick={handleLog}
        sx={{ mb: 2 }}
        disabled={loading || !meal.trim()}
      >
        Log Meal
      </Button>
      {loading && <CircularProgress sx={{ mt: 2 }} />}
      {error && (
        <Alert severity="error" sx={{ mt: 2 }}>
          {error}
        </Alert>
      )}
      <List>
        {meals.map((m) => (
          <ListItem key={m.id}>
            <ListItemText
              primary={m.meal_data?.text || JSON.stringify(m.meal_data)}
              secondary={new Date(m.created_at).toLocaleString()}
            />
          </ListItem>
        ))}
      </List>
    </Box>
  );
}
