import React, { createContext, useContext, useState, ReactNode } from "react";
import axios from "axios";

interface User {
  id: number;
  email: string;
}

interface AuthContextType {
  user: User | null;
  login: (email: string, password: string) => Promise<void>;
  register: (email: string, password: string) => Promise<void>;
  logout: () => void;
}

const AuthContext = createContext<AuthContextType | undefined>(undefined);

export function AuthProvider({ children }: { children: ReactNode }) {
  const [user, setUser] = useState<User | null>(null);

  const login = async (email: string, password: string) => {
    const res = await axios.post("http://localhost:3000/users/login", {
      email,
      password,
    });
    setUser(res.data);
  };

  const register = async (email: string, password: string) => {
    const res = await axios.post("http://localhost:3000/users/register", {
      email,
      password,
    });
    setUser(res.data);
  };

  const logout = () => setUser(null);

  return (
    <AuthContext.Provider value={{ user, login, register, logout }}>
      {children}
    </AuthContext.Provider>
  );
}

export function useAuth() {
  const ctx = useContext(AuthContext);
  if (!ctx) throw new Error("useAuth must be used within AuthProvider");
  return ctx;
}
