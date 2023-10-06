CREATE TABLE events(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    price INTEGER NOT NULL,
    image TEXT,
    local TEXT NOT NULL,
    date TEXT NOT NULL
);