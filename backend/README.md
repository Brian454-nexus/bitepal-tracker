# BitePal Backend

## Setup

1. Install dependencies:

   ```bash
   npm install
   ```

2. Create a PostgreSQL database and user. Update `.env` with your credentials:

   ```env
   PGHOST=localhost
   PGUSER=your_db_user
   PGPASSWORD=your_db_password
   PGDATABASE=your_db_name
   PGPORT=5432
   ```

3. Create the users table:

   ```sql
   CREATE TABLE users (
     id SERIAL PRIMARY KEY,
     email TEXT UNIQUE NOT NULL,
     password TEXT NOT NULL
   );
   ```

4. Create the meals table:

   ```sql
   CREATE TABLE meals (
     id SERIAL PRIMARY KEY,
     user_id INTEGER REFERENCES users(id),
     meal_data JSONB NOT NULL,
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   ```

5. Start the server:
   ```bash
   npm start
   ```

## Endpoints

- `POST /users/register` — Register a new user
- `POST /users/login` — Login
- `GET /health` — Health check
- `POST /ai/analyze-meal` — AI meal analysis (placeholder)
- `POST /meal/log` — Log a meal
- `GET /meal/history/:user_id` — Get meal history for a user
- `POST /meal/analyze` — AI-powered meal analysis (placeholder)
