const express = require("express");
const router = express.Router();
const pool = require("../db");

// Log a meal
router.post("/log", async (req, res) => {
  const { user_id, meal_data } = req.body;
  if (!user_id || !meal_data)
    return res.status(400).json({ error: "Missing fields" });
  try {
    const result = await pool.query(
      "INSERT INTO meals (user_id, meal_data) VALUES ($1, $2) RETURNING *",
      [user_id, meal_data]
    );
    res.json(result.rows[0]);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

// Get meal history
router.get("/history/:user_id", async (req, res) => {
  const { user_id } = req.params;
  try {
    const result = await pool.query(
      "SELECT * FROM meals WHERE user_id = $1 ORDER BY created_at DESC",
      [user_id]
    );
    res.json(result.rows);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

// AI-powered meal analysis (placeholder)
router.post("/analyze", async (req, res) => {
  // TODO: Integrate AI logic here
  res.json({ result: "AI meal analysis placeholder" });
});

module.exports = router;
