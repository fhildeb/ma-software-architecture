db = db.getSiblingDB('surveys');

db.createUser({
  user: 'root',
  pwd: 'example',
  roles: [
    {
      role: 'readWrite',
      db: 'surveys',
    },
  ],
});