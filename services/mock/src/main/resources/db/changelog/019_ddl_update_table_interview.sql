ALTER TABLE IF EXISTS interview DROP COLUMN submitter_id;
DELETE from interview;
ALTER TABLE IF EXISTS interview ADD COLUMN submitter_id INT REFERENCES submitter(id) NOT NULL;
