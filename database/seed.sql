INSERT INTO roles (name, create_case, view_case, edit_case, close_case)
 VALUES ('admin', true, true, true, true);

 INSERT INTO users (username, password, role_id, inactive)
 VALUES ('admin','admin', 1, false);

 INSERT INTO addresses (primary_line, secondary_line, zip_code, city, country)
 VALUES ('Vej 10', '', '5000', 'Odense', 'DK');

 INSERT INTO persons (first_name, middle_name, last_name, phone, email, address_id)
 VALUES ('Mads', 'Due', 'Kristensen', '112', 'test@example.com', 1);

 INSERT INTO case_workers (person_id, user_id)
 VALUES (1, 1);
