const express = require("express");
const router = express.Router();

// Health check
router.get("/health", (req, res) => {
  res.json({ status: "ok" });
});

// Placeholder for AI endpoint
router.post("/ai/analyze-meal", async (req, res) => {
  // TODO: Integrate AI logic here
  res.json({ result: "AI analysis result placeholder" });
});

module.exports = router;
