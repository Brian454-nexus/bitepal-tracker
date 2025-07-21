import { useState } from "react";
import {
  Typography,
  TextField,
  Button,
  Box,
  CircularProgress,
  Alert,
} from "@mui/material";
import axios from "axios";

export default function AIAnalysis() {
  const [meal, setMeal] = useState("");
  const [result, setResult] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const handleAnalyze = async () => {
    setLoading(true);
    setError(null);
    setResult(null);
    try {
      const res = await axios.post("http://localhost:3000/meal/analyze", {
        meal,
      });
      setResult(res.data.result);
    } catch (err: any) {
      setError(err.message || "Error analyzing meal");
    } finally {
      setLoading(false);
    }
  };

  return (
    <Box>
      <Typography variant="h4" gutterBottom>
        AI Meal Analysis
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
        onClick={handleAnalyze}
        disabled={loading || !meal.trim()}
      >
        Analyze
      </Button>
      {loading && <CircularProgress sx={{ mt: 2 }} />}
      {result && (
        <Alert severity="success" sx={{ mt: 2 }}>
          {result}
        </Alert>
      )}
      {error && (
        <Alert severity="error" sx={{ mt: 2 }}>
          {error}
        </Alert>
      )}
    </Box>
  );
}
