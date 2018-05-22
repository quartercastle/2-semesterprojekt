INSERT INTO roles (name, create_case, view_case, edit_case, close_case)
VALUES ('admin', true, true, true, true);

INSERT INTO users (username, password, role_id, inactive)
VALUES ('admin','admin', 1, false);
