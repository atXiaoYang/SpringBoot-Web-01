#!/bin/bash
while ! mysqladmin ping -h mysql --silent; do
  echo "⏳ Waiting for MySQL..."
  sleep 2
done
echo "✅ MySQL is up!"
exec " $ @"
