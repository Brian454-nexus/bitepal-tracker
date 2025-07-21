import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import {
  AppBar,
  Toolbar,
  Typography,
  Button,
  Container,
  Box,
} from "@mui/material";
import Highlights from "./components/Highlights";
import MealLog from "./components/MealLog";
import AIAnalysis from "./components/AIAnalysis";
import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import { useAuth } from "./contexts/AuthContext";

function App() {
  const { user, logout } = useAuth();
  return (
    <Router>
      <AppBar position="static">
        <Toolbar>
          <Typography variant="h6" sx={{ flexGrow: 1 }}>
            BitePal
          </Typography>
          <Button color="inherit" component={Link} to="/">
            Home
          </Button>
          <Button color="inherit" component={Link} to="/highlights">
            Highlights
          </Button>
          <Button color="inherit" component={Link} to="/meal-log">
            Meal Log
          </Button>
          <Button color="inherit" component={Link} to="/ai-analysis">
            AI Analysis
          </Button>
          {user ? (
            <Box sx={{ display: "flex", alignItems: "center", ml: 2 }}>
              <Typography sx={{ mr: 2 }}>{user.email}</Typography>
              <Button color="inherit" onClick={logout}>
                Logout
              </Button>
            </Box>
          ) : (
            <>
              <Button color="inherit" component={Link} to="/login">
                Login
              </Button>
              <Button color="inherit" component={Link} to="/register">
                Register
              </Button>
            </>
          )}
        </Toolbar>
      </AppBar>
      <Container sx={{ mt: 4 }}>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/highlights" element={<Highlights />} />
          <Route path="/meal-log" element={<MealLog />} />
          <Route path="/ai-analysis" element={<AIAnalysis />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
        </Routes>
      </Container>
    </Router>
  );
}

export default App;
