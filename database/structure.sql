DROP TABLE IF EXISTS users,roles,case_workers,citizens,companies,addresses,persons,cases,efforts,effort_paragraphs,services,offers,paragraphs;

CREATE TABLE users(
  id SERIAL PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255),
  role_id INTEGER NOT NULL,
  inactive BOOLEAN
);

CREATE TABLE roles(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  create_case BOOLEAN,
  view_case BOOLEAN,
  edit_case BOOLEAN,
  close_case BOOLEAN
);

CREATE TABLE case_workers(
  id SERIAL PRIMARY KEY,
  person_id INTEGER NOT NULL,
  user_id INTEGER NOT NULL
);

CREATE TABLE citizens(
  id SERIAL PRIMARY KEY,
  person_id INTEGER NOT NULL,
  cpr VARCHAR(255)
);

CREATE TABLE companies(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  address_id INTEGER NOT NULL
);

CREATE TABLE addresses(
  id SERIAL PRIMARY KEY,
  primary_line VARCHAR(255),
  secondary_line VARCHAR(255),
  zip_code VARCHAR(255),
  city VARCHAR(255),
  country VARCHAR(255)
);

CREATE TABLE persons(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  middle_name VARCHAR(255),
  last_name VARCHAR(255),
  phone VARCHAR(255),
  email VARCHAR(255),
  address_id INTEGER NOT NULL
);

CREATE TABLE cases(
  id SERIAL PRIMARY KEY,
  citizen_id INTEGER NOT NULL,
  case_worker_id INTEGER NOT NULL,
  circumstance TEXT,
  inquiry TEXT,
  further_course TEXT,
  is_informed_about_rights BOOLEAN,
  is_informed_about_duties BOOLEAN,
  company_id INTEGER NOT NULL,
  practical_tasks_support BOOLEAN,
  personal_care_support BOOLEAN,
  temporary_stay BOOLEAN,
  longer_stay BOOLEAN,
  learning_support BOOLEAN,
  rehabilitation_support BOOLEAN,
  driving_support BOOLEAN,
  temporary_house_offer BOOLEAN,
  personal_care_offer BOOLEAN,
  support_grocery_offer BOOLEAN,
  longer_stay_offer BOOLEAN,
  learning_offer BOOLEAN,
  rehabilitation_offer BOOLEAN,
  guardianship BOOLEAN,
  none_acting_guardian BOOLEAN,
  curatorship BOOLEAN,
  assessor BOOLEAN,
  party_representative BOOLEAN,
  power_of_attorney BOOLEAN,
  right_to_assessor_or_party_representative BOOLEAN,
  information_saved_online BOOLEAN
);

CREATE TABLE efforts(
  id SERIAL PRIMARY KEY,
  case_id INTEGER NOT NULL,
  service_id INTEGER NOT NULL,
  offer_id INTEGER NOT NULL,
  total_price INTEGER NOT NULL,
  start_date Timestamp,
  end_date Timestamp,
  responsibility VARCHAR(255)
);

CREATE TABLE effort_paragraphs(
  effort_id INTEGER NOT NULL,
  paragraph_id INTEGER NOT NULL
);

CREATE TABLE services(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  frequens INTEGER NOT NULL,
  unit INTEGER NOT NULL,
  price INTEGER NOT NULL,
  repetition INTEGER NOT NULL,
  description TEXT
);


CREATE TABLE offers(
  id SERIAL PRIMARY KEY,
  number INTEGER NOT NULL,
  title VARCHAR(255),
  description TEXT
);


CREATE TABLE paragraphs(
  id SERIAL PRIMARY KEY,
  number INTEGER NOT NULL,
  title VARCHAR(255),
  description TEXT
);
