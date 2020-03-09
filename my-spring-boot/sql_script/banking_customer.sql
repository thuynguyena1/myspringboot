--1.create database
CREATE DATABASE myspring
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       CONNECTION LIMIT = -1;

--please set active 'myspring' database before run script below
--2.create schema
CREATE SCHEMA banking_data;
      
--3. create table      
CREATE TABLE banking_data.banking_customers (
    id                  serial        	NOT NULL	PRIMARY KEY,
	name                text   			NOT NULL,
	phone               text   			NOT NULL,
    email               text   			NOT NULL
);