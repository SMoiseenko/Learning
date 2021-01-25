--
-- PostgreSQL database dump
--

-- Dumped from database version 12.4 (Ubuntu 12.4-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.4 (Ubuntu 12.4-0ubuntu0.20.04.1)

-- Started on 2020-09-21 13:44:55 +03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 7 (class 2615 OID 17002)
-- Name: customers_info; Type: SCHEMA; Schema: -; Owner: s_moiseenko
--

CREATE SCHEMA customers_info;


ALTER SCHEMA customers_info OWNER TO s_moiseenko;

--
-- TOC entry 10 (class 2615 OID 16823)
-- Name: learning_jdbc; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA learning_jdbc;


ALTER SCHEMA learning_jdbc OWNER TO postgres;

--
-- TOC entry 11 (class 2615 OID 16824)
-- Name: mywebprojectdb; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA mywebprojectdb;


ALTER SCHEMA mywebprojectdb OWNER TO postgres;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 3164 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 5 (class 2615 OID 17086)
-- Name: temp_customer_info; Type: SCHEMA; Schema: -; Owner: s_moiseenko
--

CREATE SCHEMA temp_customer_info;


ALTER SCHEMA temp_customer_info OWNER TO s_moiseenko;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 228 (class 1259 OID 17005)
-- Name: customer; Type: TABLE; Schema: customers_info; Owner: s_moiseenko
--

CREATE TABLE customers_info.customer (
    id bigint NOT NULL,
    movex_code character varying(255),
    short_name character varying(255),
    full_name character varying(255),
    t4cserver_id bigint
);


ALTER TABLE customers_info.customer OWNER TO s_moiseenko;

--
-- TOC entry 227 (class 1259 OID 17003)
-- Name: customer_id_seq; Type: SEQUENCE; Schema: customers_info; Owner: s_moiseenko
--

CREATE SEQUENCE customers_info.customer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE customers_info.customer_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3165 (class 0 OID 0)
-- Dependencies: 227
-- Name: customer_id_seq; Type: SEQUENCE OWNED BY; Schema: customers_info; Owner: s_moiseenko
--

ALTER SEQUENCE customers_info.customer_id_seq OWNED BY customers_info.customer.id;


--
-- TOC entry 230 (class 1259 OID 17019)
-- Name: pc_info; Type: TABLE; Schema: customers_info; Owner: s_moiseenko
--

CREATE TABLE customers_info.pc_info (
    id bigint NOT NULL,
    pc_type character varying(255)
);


ALTER TABLE customers_info.pc_info OWNER TO s_moiseenko;

--
-- TOC entry 229 (class 1259 OID 17017)
-- Name: pc_info_id_seq; Type: SEQUENCE; Schema: customers_info; Owner: s_moiseenko
--

CREATE SEQUENCE customers_info.pc_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE customers_info.pc_info_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3166 (class 0 OID 0)
-- Dependencies: 229
-- Name: pc_info_id_seq; Type: SEQUENCE OWNED BY; Schema: customers_info; Owner: s_moiseenko
--

ALTER SEQUENCE customers_info.pc_info_id_seq OWNED BY customers_info.pc_info.id;


--
-- TOC entry 232 (class 1259 OID 17027)
-- Name: sql_version; Type: TABLE; Schema: customers_info; Owner: s_moiseenko
--

CREATE TABLE customers_info.sql_version (
    id bigint NOT NULL,
    sql_version character varying(255)
);


ALTER TABLE customers_info.sql_version OWNER TO s_moiseenko;

--
-- TOC entry 231 (class 1259 OID 17025)
-- Name: sql_version_id_seq; Type: SEQUENCE; Schema: customers_info; Owner: s_moiseenko
--

CREATE SEQUENCE customers_info.sql_version_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE customers_info.sql_version_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3167 (class 0 OID 0)
-- Dependencies: 231
-- Name: sql_version_id_seq; Type: SEQUENCE OWNED BY; Schema: customers_info; Owner: s_moiseenko
--

ALTER SEQUENCE customers_info.sql_version_id_seq OWNED BY customers_info.sql_version.id;


--
-- TOC entry 234 (class 1259 OID 17035)
-- Name: t4c_server; Type: TABLE; Schema: customers_info; Owner: s_moiseenko
--

CREATE TABLE customers_info.t4c_server (
    id bigint NOT NULL,
    serial_number character varying(255),
    t4cversion character varying(255),
    tvid character varying(255),
    tvpwd character varying(255),
    win_login character varying(255),
    win_pwd character varying(255),
    pcinfo_id bigint,
    sqlversion_id bigint,
    windowsversion_id bigint
);


ALTER TABLE customers_info.t4c_server OWNER TO s_moiseenko;

--
-- TOC entry 233 (class 1259 OID 17033)
-- Name: t4c_server_id_seq; Type: SEQUENCE; Schema: customers_info; Owner: s_moiseenko
--

CREATE SEQUENCE customers_info.t4c_server_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE customers_info.t4c_server_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3168 (class 0 OID 0)
-- Dependencies: 233
-- Name: t4c_server_id_seq; Type: SEQUENCE OWNED BY; Schema: customers_info; Owner: s_moiseenko
--

ALTER SEQUENCE customers_info.t4c_server_id_seq OWNED BY customers_info.t4c_server.id;


--
-- TOC entry 236 (class 1259 OID 17074)
-- Name: windows_version; Type: TABLE; Schema: customers_info; Owner: s_moiseenko
--

CREATE TABLE customers_info.windows_version (
    id bigint NOT NULL,
    end_support_date date,
    name character varying(255)
);


ALTER TABLE customers_info.windows_version OWNER TO s_moiseenko;

--
-- TOC entry 235 (class 1259 OID 17072)
-- Name: windows_version_id_seq; Type: SEQUENCE; Schema: customers_info; Owner: s_moiseenko
--

CREATE SEQUENCE customers_info.windows_version_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE customers_info.windows_version_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3169 (class 0 OID 0)
-- Dependencies: 235
-- Name: windows_version_id_seq; Type: SEQUENCE OWNED BY; Schema: customers_info; Owner: s_moiseenko
--

ALTER SEQUENCE customers_info.windows_version_id_seq OWNED BY customers_info.windows_version.id;


--
-- TOC entry 206 (class 1259 OID 16825)
-- Name: authors; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.authors (
    id bigint NOT NULL,
    author_name character varying(50) NOT NULL,
    country_id bigint NOT NULL
);


ALTER TABLE learning_jdbc.authors OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16828)
-- Name: authors_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.authors_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.authors_id_seq OWNER TO postgres;

--
-- TOC entry 3171 (class 0 OID 0)
-- Dependencies: 207
-- Name: authors_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.authors_id_seq OWNED BY learning_jdbc.authors.id;


--
-- TOC entry 208 (class 1259 OID 16830)
-- Name: books; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.books (
    id bigint NOT NULL,
    book_name character varying(255),
    year_id bigint NOT NULL,
    price bigint DEFAULT 0.00 NOT NULL
);


ALTER TABLE learning_jdbc.books OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16834)
-- Name: books_authors; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.books_authors (
    author_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE learning_jdbc.books_authors OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16837)
-- Name: books_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.books_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.books_id_seq OWNER TO postgres;

--
-- TOC entry 3175 (class 0 OID 0)
-- Dependencies: 210
-- Name: books_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.books_id_seq OWNED BY learning_jdbc.books.id;


--
-- TOC entry 211 (class 1259 OID 16839)
-- Name: country_of_born; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.country_of_born (
    id bigint NOT NULL,
    country character varying(50) NOT NULL,
    population bigint
);


ALTER TABLE learning_jdbc.country_of_born OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 16842)
-- Name: country_of_born_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.country_of_born_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.country_of_born_id_seq OWNER TO postgres;

--
-- TOC entry 3178 (class 0 OID 0)
-- Dependencies: 212
-- Name: country_of_born_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.country_of_born_id_seq OWNED BY learning_jdbc.country_of_born.id;


--
-- TOC entry 213 (class 1259 OID 16844)
-- Name: persons; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.persons (
    person_id bigint NOT NULL,
    person_login character varying(255) NOT NULL,
    person_password character varying(255) NOT NULL,
    person_first_name character varying(255) NOT NULL,
    person_last_name character varying(255) NOT NULL,
    person_date_of_birth date NOT NULL,
    person_salary numeric(8,2) NOT NULL
);


ALTER TABLE learning_jdbc.persons OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16850)
-- Name: persons_person_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.persons_person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.persons_person_id_seq OWNER TO postgres;

--
-- TOC entry 3181 (class 0 OID 0)
-- Dependencies: 214
-- Name: persons_person_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.persons_person_id_seq OWNED BY learning_jdbc.persons.person_id;


--
-- TOC entry 215 (class 1259 OID 16852)
-- Name: products; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.products (
    product_id bigint NOT NULL,
    product_name character varying(20),
    product_price numeric(8,2),
    person_id bigint
);


ALTER TABLE learning_jdbc.products OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16855)
-- Name: products_product_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.products_product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.products_product_id_seq OWNER TO postgres;

--
-- TOC entry 3184 (class 0 OID 0)
-- Dependencies: 216
-- Name: products_product_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.products_product_id_seq OWNED BY learning_jdbc.products.product_id;


--
-- TOC entry 217 (class 1259 OID 16857)
-- Name: year_of_publishing; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.year_of_publishing (
    id bigint NOT NULL,
    year date
);


ALTER TABLE learning_jdbc.year_of_publishing OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16860)
-- Name: year_of_publishing_id_seq; Type: SEQUENCE; Schema: learning_jdbc; Owner: postgres
--

CREATE SEQUENCE learning_jdbc.year_of_publishing_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE learning_jdbc.year_of_publishing_id_seq OWNER TO postgres;

--
-- TOC entry 3187 (class 0 OID 0)
-- Dependencies: 218
-- Name: year_of_publishing_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.year_of_publishing_id_seq OWNED BY learning_jdbc.year_of_publishing.id;


--
-- TOC entry 219 (class 1259 OID 16862)
-- Name: periodicals; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.periodicals (
    id bigint NOT NULL,
    issn character varying(9) NOT NULL,
    periodical_type character varying(40) DEFAULT 'UNDEFINED'::character varying NOT NULL,
    title character varying(100) NOT NULL,
    description text,
    qty_per_year bigint NOT NULL,
    price numeric(10,2) DEFAULT 0.00 NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.periodicals OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16871)
-- Name: periodicals_id_seq; Type: SEQUENCE; Schema: mywebprojectdb; Owner: postgres
--

CREATE SEQUENCE mywebprojectdb.periodicals_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE mywebprojectdb.periodicals_id_seq OWNER TO postgres;

--
-- TOC entry 3190 (class 0 OID 0)
-- Dependencies: 220
-- Name: periodicals_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.periodicals_id_seq OWNED BY mywebprojectdb.periodicals.id;


--
-- TOC entry 221 (class 1259 OID 16873)
-- Name: periodicals_types; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.periodicals_types (
    type character varying(40) NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.periodicals_types OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16877)
-- Name: subscribes; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.subscribes (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    periodical_id bigint NOT NULL,
    total_price numeric(10,2) DEFAULT 0.00 NOT NULL,
    paid numeric(10,2) DEFAULT 0.00 NOT NULL,
    months_of_subscription bigint DEFAULT '0'::bigint NOT NULL,
    date_begin_subscribe date NOT NULL,
    date_end_subscribe date NOT NULL,
    payment_status boolean DEFAULT false NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.subscribes OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16885)
-- Name: subscribes_id_seq; Type: SEQUENCE; Schema: mywebprojectdb; Owner: postgres
--

CREATE SEQUENCE mywebprojectdb.subscribes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE mywebprojectdb.subscribes_id_seq OWNER TO postgres;

--
-- TOC entry 3193 (class 0 OID 0)
-- Dependencies: 223
-- Name: subscribes_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.subscribes_id_seq OWNED BY mywebprojectdb.subscribes.id;


--
-- TOC entry 224 (class 1259 OID 16887)
-- Name: users; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.users (
    id bigint NOT NULL,
    login character varying(40) NOT NULL,
    password character varying(40) NOT NULL,
    role_type character varying(40) DEFAULT 'CUSTOMER'::character varying NOT NULL,
    first_name character varying(40) NOT NULL,
    last_name character varying(40) NOT NULL,
    email character varying(40) NOT NULL,
    phone character varying(20) NOT NULL,
    address text NOT NULL,
    balance numeric(10,2) DEFAULT 0.00,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.users OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16896)
-- Name: users_id_seq; Type: SEQUENCE; Schema: mywebprojectdb; Owner: postgres
--

CREATE SEQUENCE mywebprojectdb.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE mywebprojectdb.users_id_seq OWNER TO postgres;

--
-- TOC entry 3195 (class 0 OID 0)
-- Dependencies: 225
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.users_id_seq OWNED BY mywebprojectdb.users.id;


--
-- TOC entry 226 (class 1259 OID 16898)
-- Name: users_roles; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.users_roles (
    type character varying(40) NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.users_roles OWNER TO postgres;

--
-- TOC entry 238 (class 1259 OID 17089)
-- Name: all_info; Type: TABLE; Schema: temp_customer_info; Owner: s_moiseenko
--

CREATE TABLE temp_customer_info.all_info (
    id bigint NOT NULL,
    full_name character varying(255),
    inet_access boolean NOT NULL,
    movex_code character varying(255),
    robots_qty integer NOT NULL,
    rus_name character varying(255),
    service_contract boolean NOT NULL,
    short_name character varying(255),
    sql_version character varying(255),
    t4c_license_type character varying(255),
    t4c_version character varying(255),
    tv_id character varying(255),
    tv_pwd character varying(255),
    win_login character varying(255),
    win_pwd character varying(255),
    windows_version character varying(255),
    comment text
);


ALTER TABLE temp_customer_info.all_info OWNER TO s_moiseenko;

--
-- TOC entry 237 (class 1259 OID 17087)
-- Name: all_info_id_seq; Type: SEQUENCE; Schema: temp_customer_info; Owner: s_moiseenko
--

CREATE SEQUENCE temp_customer_info.all_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE temp_customer_info.all_info_id_seq OWNER TO s_moiseenko;

--
-- TOC entry 3197 (class 0 OID 0)
-- Dependencies: 237
-- Name: all_info_id_seq; Type: SEQUENCE OWNED BY; Schema: temp_customer_info; Owner: s_moiseenko
--

ALTER SEQUENCE temp_customer_info.all_info_id_seq OWNED BY temp_customer_info.all_info.id;


--
-- TOC entry 2934 (class 2604 OID 17008)
-- Name: customer id; Type: DEFAULT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.customer ALTER COLUMN id SET DEFAULT nextval('customers_info.customer_id_seq'::regclass);


--
-- TOC entry 2935 (class 2604 OID 17022)
-- Name: pc_info id; Type: DEFAULT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.pc_info ALTER COLUMN id SET DEFAULT nextval('customers_info.pc_info_id_seq'::regclass);


--
-- TOC entry 2936 (class 2604 OID 17030)
-- Name: sql_version id; Type: DEFAULT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.sql_version ALTER COLUMN id SET DEFAULT nextval('customers_info.sql_version_id_seq'::regclass);


--
-- TOC entry 2937 (class 2604 OID 17038)
-- Name: t4c_server id; Type: DEFAULT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.t4c_server ALTER COLUMN id SET DEFAULT nextval('customers_info.t4c_server_id_seq'::regclass);


--
-- TOC entry 2938 (class 2604 OID 17077)
-- Name: windows_version id; Type: DEFAULT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.windows_version ALTER COLUMN id SET DEFAULT nextval('customers_info.windows_version_id_seq'::regclass);


--
-- TOC entry 2911 (class 2604 OID 16902)
-- Name: authors id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.authors_id_seq'::regclass);


--
-- TOC entry 2913 (class 2604 OID 16903)
-- Name: books id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.books_id_seq'::regclass);


--
-- TOC entry 2914 (class 2604 OID 16904)
-- Name: country_of_born id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.country_of_born_id_seq'::regclass);


--
-- TOC entry 2915 (class 2604 OID 16905)
-- Name: persons person_id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.persons ALTER COLUMN person_id SET DEFAULT nextval('learning_jdbc.persons_person_id_seq'::regclass);


--
-- TOC entry 2916 (class 2604 OID 16906)
-- Name: products product_id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products ALTER COLUMN product_id SET DEFAULT nextval('learning_jdbc.products_product_id_seq'::regclass);


--
-- TOC entry 2917 (class 2604 OID 16907)
-- Name: year_of_publishing id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.year_of_publishing ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.year_of_publishing_id_seq'::regclass);


--
-- TOC entry 2921 (class 2604 OID 16908)
-- Name: periodicals id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.periodicals_id_seq'::regclass);


--
-- TOC entry 2928 (class 2604 OID 16909)
-- Name: subscribes id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.subscribes_id_seq'::regclass);


--
-- TOC entry 2932 (class 2604 OID 16910)
-- Name: users id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.users_id_seq'::regclass);


--
-- TOC entry 2939 (class 2604 OID 17092)
-- Name: all_info id; Type: DEFAULT; Schema: temp_customer_info; Owner: s_moiseenko
--

ALTER TABLE ONLY temp_customer_info.all_info ALTER COLUMN id SET DEFAULT nextval('temp_customer_info.all_info_id_seq'::regclass);


--
-- TOC entry 3146 (class 0 OID 17005)
-- Dependencies: 228
-- Data for Name: customer; Type: TABLE DATA; Schema: customers_info; Owner: s_moiseenko
--

INSERT INTO customers_info.customer VALUES (1, '730000000', 'SKL', NULL, NULL);
INSERT INTO customers_info.customer VALUES (2, '730000003', 'KNR', NULL, NULL);
INSERT INTO customers_info.customer VALUES (3, '730000002', 'SMR', NULL, NULL);
INSERT INTO customers_info.customer VALUES (4, '730000004', 'HTL', NULL, NULL);
INSERT INTO customers_info.customer VALUES (5, '730000005', 'MZL', NULL, NULL);


--
-- TOC entry 3148 (class 0 OID 17019)
-- Dependencies: 230
-- Data for Name: pc_info; Type: TABLE DATA; Schema: customers_info; Owner: s_moiseenko
--



--
-- TOC entry 3150 (class 0 OID 17027)
-- Dependencies: 232
-- Data for Name: sql_version; Type: TABLE DATA; Schema: customers_info; Owner: s_moiseenko
--



--
-- TOC entry 3152 (class 0 OID 17035)
-- Dependencies: 234
-- Data for Name: t4c_server; Type: TABLE DATA; Schema: customers_info; Owner: s_moiseenko
--



--
-- TOC entry 3154 (class 0 OID 17074)
-- Dependencies: 236
-- Data for Name: windows_version; Type: TABLE DATA; Schema: customers_info; Owner: s_moiseenko
--

INSERT INTO customers_info.windows_version VALUES (1, '2020-10-14', 'Windows 10');


--
-- TOC entry 3124 (class 0 OID 16825)
-- Dependencies: 206
-- Data for Name: authors; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.authors VALUES (1, 'Lacy Cluely', 20);
INSERT INTO learning_jdbc.authors VALUES (2, 'Lindsay Bonifas', 22);
INSERT INTO learning_jdbc.authors VALUES (3, 'Abbe Begbie', 34);
INSERT INTO learning_jdbc.authors VALUES (4, 'Emmet Dungay', 32);
INSERT INTO learning_jdbc.authors VALUES (5, 'Jarred Humberston', 1);
INSERT INTO learning_jdbc.authors VALUES (6, 'Bobbee Waring', 30);
INSERT INTO learning_jdbc.authors VALUES (7, 'Tamma Stanlock', 2);
INSERT INTO learning_jdbc.authors VALUES (8, 'Kaitlin Colten', 23);
INSERT INTO learning_jdbc.authors VALUES (9, 'Gerta Espinho', 33);
INSERT INTO learning_jdbc.authors VALUES (10, 'Felice Hindes', 30);
INSERT INTO learning_jdbc.authors VALUES (11, 'Rodrick Gladdifh', 21);
INSERT INTO learning_jdbc.authors VALUES (12, 'Farica Cookney', 18);
INSERT INTO learning_jdbc.authors VALUES (13, 'Hildegarde Largen', 19);
INSERT INTO learning_jdbc.authors VALUES (14, 'Winifred Stinton', 18);
INSERT INTO learning_jdbc.authors VALUES (15, 'Celka McCrie', 12);
INSERT INTO learning_jdbc.authors VALUES (16, 'Warner Bertl', 13);
INSERT INTO learning_jdbc.authors VALUES (17, 'Dylan Pieroni', 17);
INSERT INTO learning_jdbc.authors VALUES (18, 'Meredithe Ashborn', 35);
INSERT INTO learning_jdbc.authors VALUES (19, 'Even Gyurko', 13);
INSERT INTO learning_jdbc.authors VALUES (20, 'Heinrick Musicka', 23);
INSERT INTO learning_jdbc.authors VALUES (21, 'Betti Blaise', 20);
INSERT INTO learning_jdbc.authors VALUES (22, 'Melisent Treadger', 19);
INSERT INTO learning_jdbc.authors VALUES (23, 'Lorilee Monkman', 21);
INSERT INTO learning_jdbc.authors VALUES (24, 'Nev Bloy', 27);
INSERT INTO learning_jdbc.authors VALUES (25, 'Sergent Darcey', 18);
INSERT INTO learning_jdbc.authors VALUES (26, 'Linda Pountney', 12);
INSERT INTO learning_jdbc.authors VALUES (27, 'Teddy Hockey', 13);
INSERT INTO learning_jdbc.authors VALUES (28, 'Esme Muldrew', 20);
INSERT INTO learning_jdbc.authors VALUES (29, 'Nedi Weldon', 32);
INSERT INTO learning_jdbc.authors VALUES (30, 'Iggie Lantoph', 35);
INSERT INTO learning_jdbc.authors VALUES (31, 'Merline Burnhams', 15);
INSERT INTO learning_jdbc.authors VALUES (32, 'Carney Flockhart', 32);
INSERT INTO learning_jdbc.authors VALUES (33, 'Adolpho Riddiford', 32);
INSERT INTO learning_jdbc.authors VALUES (34, 'Katine Harmant', 13);
INSERT INTO learning_jdbc.authors VALUES (35, 'Tallie Trousdale', 24);
INSERT INTO learning_jdbc.authors VALUES (36, 'Rheta Brindley', 13);
INSERT INTO learning_jdbc.authors VALUES (37, 'Lanae De Metz', 3);
INSERT INTO learning_jdbc.authors VALUES (38, 'Grady Shurmer', 21);
INSERT INTO learning_jdbc.authors VALUES (39, 'Weidar Alessandretti', 20);
INSERT INTO learning_jdbc.authors VALUES (40, 'Chane Ballintime', 27);
INSERT INTO learning_jdbc.authors VALUES (41, 'Valentijn Domini', 13);
INSERT INTO learning_jdbc.authors VALUES (42, 'Brigida Heynel', 9);
INSERT INTO learning_jdbc.authors VALUES (43, 'Alden Wiggam', 2);
INSERT INTO learning_jdbc.authors VALUES (44, 'Padget Dyball', 32);
INSERT INTO learning_jdbc.authors VALUES (45, 'Drucy Ingleston', 15);
INSERT INTO learning_jdbc.authors VALUES (46, 'Skipton Hitter', 35);
INSERT INTO learning_jdbc.authors VALUES (47, 'Erika Chinnick', 17);
INSERT INTO learning_jdbc.authors VALUES (48, 'Teddie Dailly', 30);
INSERT INTO learning_jdbc.authors VALUES (49, 'Nora Halcro', 14);
INSERT INTO learning_jdbc.authors VALUES (50, 'Conway Simonou', 25);
INSERT INTO learning_jdbc.authors VALUES (51, 'Marthe Lain', 15);
INSERT INTO learning_jdbc.authors VALUES (52, 'Rubina Dewan', 6);
INSERT INTO learning_jdbc.authors VALUES (53, 'Dorothee Gergely', 8);
INSERT INTO learning_jdbc.authors VALUES (54, 'Erena Dresse', 11);
INSERT INTO learning_jdbc.authors VALUES (55, 'Gabi Kydd', 9);
INSERT INTO learning_jdbc.authors VALUES (56, 'Caleb Cordeau]', 18);
INSERT INTO learning_jdbc.authors VALUES (57, 'Wade Royston', 37);
INSERT INTO learning_jdbc.authors VALUES (58, 'Vonnie Florentine', 14);
INSERT INTO learning_jdbc.authors VALUES (59, 'Cyrillus Northall', 25);
INSERT INTO learning_jdbc.authors VALUES (62, 'Silvie Camoys', 4);
INSERT INTO learning_jdbc.authors VALUES (63, 'Korella Vasyaev', 21);
INSERT INTO learning_jdbc.authors VALUES (64, 'Francois Flewan', 5);
INSERT INTO learning_jdbc.authors VALUES (65, 'Coleman Trudgion', 37);
INSERT INTO learning_jdbc.authors VALUES (66, 'Korney Stubbin', 14);
INSERT INTO learning_jdbc.authors VALUES (67, 'Leta Cousens', 5);
INSERT INTO learning_jdbc.authors VALUES (68, 'Earle Aston', 22);
INSERT INTO learning_jdbc.authors VALUES (69, 'Pavla Bengtsson', 25);
INSERT INTO learning_jdbc.authors VALUES (70, 'Cully Fright', 38);
INSERT INTO learning_jdbc.authors VALUES (71, 'Phedra Sygroves', 16);
INSERT INTO learning_jdbc.authors VALUES (72, 'Norbie Flexman', 16);
INSERT INTO learning_jdbc.authors VALUES (73, 'Mahalia Lambertini', 22);
INSERT INTO learning_jdbc.authors VALUES (74, 'Gorden Giraudou', 14);
INSERT INTO learning_jdbc.authors VALUES (75, 'Dori Tollet', 28);
INSERT INTO learning_jdbc.authors VALUES (76, 'Skyler Josefsson', 26);
INSERT INTO learning_jdbc.authors VALUES (77, 'Abbe Banaszewski', 16);
INSERT INTO learning_jdbc.authors VALUES (78, 'Yevette Sigward', 24);
INSERT INTO learning_jdbc.authors VALUES (79, 'Tedd Parsell', 31);
INSERT INTO learning_jdbc.authors VALUES (80, 'Laurella Egginton', 16);
INSERT INTO learning_jdbc.authors VALUES (81, 'Krishna Service', 35);
INSERT INTO learning_jdbc.authors VALUES (82, 'Kevyn Jankin', 29);
INSERT INTO learning_jdbc.authors VALUES (83, 'Giorgi Sexton', 18);
INSERT INTO learning_jdbc.authors VALUES (84, 'Keelby Lushey', 25);
INSERT INTO learning_jdbc.authors VALUES (85, 'Moss Crop', 22);
INSERT INTO learning_jdbc.authors VALUES (86, 'Munmro Crawshaw', 35);
INSERT INTO learning_jdbc.authors VALUES (87, 'Bary Caley', 1);
INSERT INTO learning_jdbc.authors VALUES (88, 'Mair Fines', 27);
INSERT INTO learning_jdbc.authors VALUES (89, 'Emlyn Forrestall', 32);
INSERT INTO learning_jdbc.authors VALUES (90, 'Holt Custy', 1);
INSERT INTO learning_jdbc.authors VALUES (91, 'Barnabe Codlin', 17);
INSERT INTO learning_jdbc.authors VALUES (92, 'Flo Hackworthy', 6);
INSERT INTO learning_jdbc.authors VALUES (93, 'Antonino Bartomeu', 36);
INSERT INTO learning_jdbc.authors VALUES (94, 'Morgen Siseland', 31);
INSERT INTO learning_jdbc.authors VALUES (96, 'Julianna Tarbet', 20);
INSERT INTO learning_jdbc.authors VALUES (97, 'Eberto Rojel', 28);
INSERT INTO learning_jdbc.authors VALUES (98, 'Quincy Kirkbright', 13);
INSERT INTO learning_jdbc.authors VALUES (99, 'Nina Joselin', 19);
INSERT INTO learning_jdbc.authors VALUES (100, 'Dorris Reddoch', 25);
INSERT INTO learning_jdbc.authors VALUES (101, 'Dwight Gaitskell', 28);
INSERT INTO learning_jdbc.authors VALUES (102, 'Ashby Mair', 36);
INSERT INTO learning_jdbc.authors VALUES (103, 'Erinn Hawthorn', 7);
INSERT INTO learning_jdbc.authors VALUES (104, 'Kassie Blyde', 5);
INSERT INTO learning_jdbc.authors VALUES (105, 'Toni Hairsine', 7);
INSERT INTO learning_jdbc.authors VALUES (106, 'Olenolin Maudlen', 32);
INSERT INTO learning_jdbc.authors VALUES (108, 'Brett Higgonet', 13);
INSERT INTO learning_jdbc.authors VALUES (109, 'Terri-jo Meus', 14);
INSERT INTO learning_jdbc.authors VALUES (110, 'Jenine Bowell', 11);
INSERT INTO learning_jdbc.authors VALUES (111, 'Almira Elflain', 24);
INSERT INTO learning_jdbc.authors VALUES (112, 'Robinetta D''Oyley', 35);
INSERT INTO learning_jdbc.authors VALUES (113, 'Lane Keitch', 1);
INSERT INTO learning_jdbc.authors VALUES (114, 'Gerhardine Routley', 37);
INSERT INTO learning_jdbc.authors VALUES (115, 'Almeda Petrichat', 27);
INSERT INTO learning_jdbc.authors VALUES (116, 'Dorree Malsher', 8);
INSERT INTO learning_jdbc.authors VALUES (117, 'Obie Fynes', 28);
INSERT INTO learning_jdbc.authors VALUES (118, 'Marris Szymanowski', 26);
INSERT INTO learning_jdbc.authors VALUES (119, 'Westley Desforges', 11);
INSERT INTO learning_jdbc.authors VALUES (120, 'Estelle Bernade', 9);
INSERT INTO learning_jdbc.authors VALUES (121, 'Bethena Smardon', 30);
INSERT INTO learning_jdbc.authors VALUES (122, 'Meta Royston', 9);
INSERT INTO learning_jdbc.authors VALUES (123, 'Golda Crane', 31);
INSERT INTO learning_jdbc.authors VALUES (124, 'Oneida Bourley', 30);
INSERT INTO learning_jdbc.authors VALUES (125, 'Pegeen Coventon', 11);
INSERT INTO learning_jdbc.authors VALUES (126, 'Rosalie Cleugher', 4);
INSERT INTO learning_jdbc.authors VALUES (127, 'Sullivan McSperrin', 2);
INSERT INTO learning_jdbc.authors VALUES (128, 'Valery Zukierman', 32);
INSERT INTO learning_jdbc.authors VALUES (129, 'Wren Fost', 28);
INSERT INTO learning_jdbc.authors VALUES (130, 'Grace Godman', 2);
INSERT INTO learning_jdbc.authors VALUES (131, 'Lolita D''Alessandro', 7);
INSERT INTO learning_jdbc.authors VALUES (132, 'Gustavo Grigolon', 5);
INSERT INTO learning_jdbc.authors VALUES (133, 'Mason Lowson', 5);
INSERT INTO learning_jdbc.authors VALUES (134, 'Northrup Ewens', 18);
INSERT INTO learning_jdbc.authors VALUES (135, 'Sunshine Doughartie', 38);
INSERT INTO learning_jdbc.authors VALUES (136, 'Thea Botler', 12);
INSERT INTO learning_jdbc.authors VALUES (137, 'Nollie Vanini', 13);
INSERT INTO learning_jdbc.authors VALUES (138, 'Domini Woof', 39);
INSERT INTO learning_jdbc.authors VALUES (139, 'Gaylene Mitro', 24);
INSERT INTO learning_jdbc.authors VALUES (140, 'Robin Zannuto', 4);
INSERT INTO learning_jdbc.authors VALUES (141, 'Leisha Gourdon', 18);
INSERT INTO learning_jdbc.authors VALUES (142, 'Nettle Beauchamp', 21);
INSERT INTO learning_jdbc.authors VALUES (143, 'Benjy Castan', 20);
INSERT INTO learning_jdbc.authors VALUES (144, 'Fidelia Wimes', 6);
INSERT INTO learning_jdbc.authors VALUES (145, 'Cass Ossenna', 27);
INSERT INTO learning_jdbc.authors VALUES (146, 'Elwira Vanshin', 18);
INSERT INTO learning_jdbc.authors VALUES (147, 'Rickard Launchbury', 12);
INSERT INTO learning_jdbc.authors VALUES (148, 'Jarrad Lambeth', 19);
INSERT INTO learning_jdbc.authors VALUES (149, 'Alameda Donner', 15);
INSERT INTO learning_jdbc.authors VALUES (150, 'Kerianne Huriche', 18);
INSERT INTO learning_jdbc.authors VALUES (151, 'Yuri Gandey', 33);
INSERT INTO learning_jdbc.authors VALUES (152, 'Annabelle Ibell', 8);
INSERT INTO learning_jdbc.authors VALUES (153, 'Katinka Lowfill', 36);
INSERT INTO learning_jdbc.authors VALUES (154, 'Easter Bruyet', 3);
INSERT INTO learning_jdbc.authors VALUES (155, 'Anastasie Dee', 3);
INSERT INTO learning_jdbc.authors VALUES (156, 'Tani Buckler', 35);
INSERT INTO learning_jdbc.authors VALUES (157, 'Kelwin Smithend', 14);
INSERT INTO learning_jdbc.authors VALUES (158, 'Olly Staddom', 3);
INSERT INTO learning_jdbc.authors VALUES (159, 'Justina Scragg', 29);
INSERT INTO learning_jdbc.authors VALUES (160, 'Filippa Alennikov', 13);
INSERT INTO learning_jdbc.authors VALUES (161, 'Melisent Faulkener', 2);
INSERT INTO learning_jdbc.authors VALUES (162, 'Lorette Astall', 26);
INSERT INTO learning_jdbc.authors VALUES (163, 'Arnie Josham', 17);
INSERT INTO learning_jdbc.authors VALUES (164, 'Rinaldo Fearneley', 5);
INSERT INTO learning_jdbc.authors VALUES (165, 'Anna Garrould', 24);
INSERT INTO learning_jdbc.authors VALUES (166, 'Melly Morefield', 28);
INSERT INTO learning_jdbc.authors VALUES (167, 'Chiarra Corradi', 15);
INSERT INTO learning_jdbc.authors VALUES (168, 'Gene Adamek', 15);
INSERT INTO learning_jdbc.authors VALUES (169, 'Marisa Solomonides', 21);
INSERT INTO learning_jdbc.authors VALUES (170, 'Laverna Stallworthy', 15);
INSERT INTO learning_jdbc.authors VALUES (171, 'Koral Hastewell', 11);
INSERT INTO learning_jdbc.authors VALUES (172, 'Cecile Burnet', 23);
INSERT INTO learning_jdbc.authors VALUES (173, 'Sharia Matyugin', 31);
INSERT INTO learning_jdbc.authors VALUES (174, 'Cherilynn Kun', 28);
INSERT INTO learning_jdbc.authors VALUES (175, 'Valentia Dalli', 6);
INSERT INTO learning_jdbc.authors VALUES (176, 'Demetris Shelp', 37);
INSERT INTO learning_jdbc.authors VALUES (177, 'Cyrill Marling', 18);
INSERT INTO learning_jdbc.authors VALUES (178, 'Ninette Gouth', 14);
INSERT INTO learning_jdbc.authors VALUES (179, 'Eryn Wagenen', 16);
INSERT INTO learning_jdbc.authors VALUES (180, 'Collie MacArd', 25);
INSERT INTO learning_jdbc.authors VALUES (181, 'Sherwood Grinham', 2);
INSERT INTO learning_jdbc.authors VALUES (183, 'Mord Jinks', 29);
INSERT INTO learning_jdbc.authors VALUES (185, 'Jaime Jeppe', 33);
INSERT INTO learning_jdbc.authors VALUES (186, 'Dorette Bellelli', 6);
INSERT INTO learning_jdbc.authors VALUES (187, 'Pearle Sealand', 33);
INSERT INTO learning_jdbc.authors VALUES (188, 'Rob Swallow', 4);
INSERT INTO learning_jdbc.authors VALUES (189, 'Wilmer Parkins', 20);
INSERT INTO learning_jdbc.authors VALUES (190, 'Hope Carlett', 12);
INSERT INTO learning_jdbc.authors VALUES (191, 'Randal Anderbrugge', 32);
INSERT INTO learning_jdbc.authors VALUES (192, 'Elane Leander', 12);
INSERT INTO learning_jdbc.authors VALUES (193, 'Hillary Wynne', 11);
INSERT INTO learning_jdbc.authors VALUES (194, 'Grenville Keeler', 11);
INSERT INTO learning_jdbc.authors VALUES (196, 'Krissy Portt', 4);
INSERT INTO learning_jdbc.authors VALUES (197, 'Adel Andric', 4);
INSERT INTO learning_jdbc.authors VALUES (198, 'Avis Grisbrook', 13);
INSERT INTO learning_jdbc.authors VALUES (199, 'Duff Moreton', 15);
INSERT INTO learning_jdbc.authors VALUES (200, 'Consolata Tatlowe', 26);
INSERT INTO learning_jdbc.authors VALUES (201, 'Dodie Eslemont', 30);
INSERT INTO learning_jdbc.authors VALUES (202, 'Reiko Screach', 8);
INSERT INTO learning_jdbc.authors VALUES (203, 'Vassili Fearnyhough', 4);
INSERT INTO learning_jdbc.authors VALUES (204, 'Hailey Pottes', 16);
INSERT INTO learning_jdbc.authors VALUES (205, 'Brooks Laffan', 16);
INSERT INTO learning_jdbc.authors VALUES (206, 'Thornie McIlwraith', 15);
INSERT INTO learning_jdbc.authors VALUES (207, 'Charissa Gouley', 35);
INSERT INTO learning_jdbc.authors VALUES (208, 'Salome Tithecote', 18);
INSERT INTO learning_jdbc.authors VALUES (209, 'Ingelbert Govenlock', 15);
INSERT INTO learning_jdbc.authors VALUES (210, 'Christopher Battleson', 5);
INSERT INTO learning_jdbc.authors VALUES (211, 'Tiffie Challin', 13);
INSERT INTO learning_jdbc.authors VALUES (212, 'Ned Wiz', 22);
INSERT INTO learning_jdbc.authors VALUES (213, 'Robinet Gennrich', 2);
INSERT INTO learning_jdbc.authors VALUES (214, 'Ysabel Crickmoor', 2);
INSERT INTO learning_jdbc.authors VALUES (215, 'Andrei Polgreen', 37);
INSERT INTO learning_jdbc.authors VALUES (216, 'Jerald Sheron', 29);
INSERT INTO learning_jdbc.authors VALUES (217, 'Roana Barkas', 36);
INSERT INTO learning_jdbc.authors VALUES (218, 'Isabelle Mowatt', 39);
INSERT INTO learning_jdbc.authors VALUES (219, 'Deanne Frodsam', 20);
INSERT INTO learning_jdbc.authors VALUES (220, 'Mattias Zum Felde', 13);
INSERT INTO learning_jdbc.authors VALUES (221, 'Rudolfo Points', 8);
INSERT INTO learning_jdbc.authors VALUES (222, 'Guntar Pauls', 6);
INSERT INTO learning_jdbc.authors VALUES (223, 'Lorri Preon', 16);
INSERT INTO learning_jdbc.authors VALUES (224, 'Abbe Vashchenko', 22);
INSERT INTO learning_jdbc.authors VALUES (225, 'Quinton Donat', 39);
INSERT INTO learning_jdbc.authors VALUES (226, 'Rowland Donavan', 2);
INSERT INTO learning_jdbc.authors VALUES (227, 'Alisander Thexton', 14);
INSERT INTO learning_jdbc.authors VALUES (228, 'Tonnie Matevosian', 34);
INSERT INTO learning_jdbc.authors VALUES (229, 'Pietro Joel', 34);
INSERT INTO learning_jdbc.authors VALUES (230, 'Britni Burnip', 12);
INSERT INTO learning_jdbc.authors VALUES (231, 'Patience Washbrook', 36);
INSERT INTO learning_jdbc.authors VALUES (232, 'Pansie MacCart', 13);
INSERT INTO learning_jdbc.authors VALUES (233, 'Dana Dafydd', 19);
INSERT INTO learning_jdbc.authors VALUES (234, 'Jeanie Hacking', 24);
INSERT INTO learning_jdbc.authors VALUES (235, 'Haven Kingscott', 9);
INSERT INTO learning_jdbc.authors VALUES (236, 'Fidela Gocher', 18);
INSERT INTO learning_jdbc.authors VALUES (237, 'Cart Cramond', 6);
INSERT INTO learning_jdbc.authors VALUES (238, 'Bendix Ionn', 30);
INSERT INTO learning_jdbc.authors VALUES (239, 'Edy Rabat', 28);
INSERT INTO learning_jdbc.authors VALUES (240, 'Olin Le Galle', 36);
INSERT INTO learning_jdbc.authors VALUES (241, 'Emlyn Boanas', 30);
INSERT INTO learning_jdbc.authors VALUES (242, 'Forrester Greenman', 16);
INSERT INTO learning_jdbc.authors VALUES (243, 'Chiarra MacVay', 23);
INSERT INTO learning_jdbc.authors VALUES (244, 'Marianna Giacopelo', 29);
INSERT INTO learning_jdbc.authors VALUES (245, 'Boycey Doorly', 22);
INSERT INTO learning_jdbc.authors VALUES (246, 'Huberto Dunhill', 37);
INSERT INTO learning_jdbc.authors VALUES (247, 'Chariot Watkins', 34);
INSERT INTO learning_jdbc.authors VALUES (248, 'Ambur Skilbeck', 22);
INSERT INTO learning_jdbc.authors VALUES (249, 'Artie Parmiter', 26);
INSERT INTO learning_jdbc.authors VALUES (250, 'Cherida Conville', 3);


--
-- TOC entry 3126 (class 0 OID 16830)
-- Dependencies: 208
-- Data for Name: books; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.books VALUES (1, 'Tampflex', 22, 733);
INSERT INTO learning_jdbc.books VALUES (2, 'Cardguard', 15, 1322);
INSERT INTO learning_jdbc.books VALUES (3, 'Stim', 34, 265);
INSERT INTO learning_jdbc.books VALUES (4, 'Matsoft', 11, 413);
INSERT INTO learning_jdbc.books VALUES (5, 'Stronghold', 24, 289);
INSERT INTO learning_jdbc.books VALUES (6, 'Flowdesk', 10, 1480);
INSERT INTO learning_jdbc.books VALUES (7, 'Fintone', 3, 212);
INSERT INTO learning_jdbc.books VALUES (8, 'Regrant', 9, 492);
INSERT INTO learning_jdbc.books VALUES (9, 'Namfix', 26, 1182);
INSERT INTO learning_jdbc.books VALUES (10, 'Viva', 32, 570);
INSERT INTO learning_jdbc.books VALUES (11, 'Prodder', 23, 1399);
INSERT INTO learning_jdbc.books VALUES (12, 'Wrapsafe', 4, 722);
INSERT INTO learning_jdbc.books VALUES (13, 'Zathin', 11, 125);
INSERT INTO learning_jdbc.books VALUES (14, 'Konklux', 34, 1167);
INSERT INTO learning_jdbc.books VALUES (15, 'Voyatouch', 16, 335);
INSERT INTO learning_jdbc.books VALUES (16, 'Veribet', 40, 1225);
INSERT INTO learning_jdbc.books VALUES (17, 'Bigtax', 4, 1353);
INSERT INTO learning_jdbc.books VALUES (18, 'Solarbreeze', 18, 1151);
INSERT INTO learning_jdbc.books VALUES (19, 'Home Ing', 18, 302);
INSERT INTO learning_jdbc.books VALUES (20, 'Bytecard', 6, 1337);
INSERT INTO learning_jdbc.books VALUES (21, 'Quo Lux', 22, 466);
INSERT INTO learning_jdbc.books VALUES (22, 'Span', 1, 256);
INSERT INTO learning_jdbc.books VALUES (23, 'Ronstring', 20, 272);
INSERT INTO learning_jdbc.books VALUES (24, 'Tin', 28, 533);
INSERT INTO learning_jdbc.books VALUES (25, 'Duobam', 27, 1266);
INSERT INTO learning_jdbc.books VALUES (26, 'Trippledex', 23, 1432);
INSERT INTO learning_jdbc.books VALUES (27, 'Latlux', 2, 606);
INSERT INTO learning_jdbc.books VALUES (28, 'Bitwolf', 27, 266);
INSERT INTO learning_jdbc.books VALUES (29, 'Holdlamis', 8, 64);
INSERT INTO learning_jdbc.books VALUES (30, 'Gembucket', 11, 1074);
INSERT INTO learning_jdbc.books VALUES (31, 'Fixflex', 8, 796);
INSERT INTO learning_jdbc.books VALUES (32, 'Transcof', 16, 1284);
INSERT INTO learning_jdbc.books VALUES (33, 'Kanlam', 16, 1410);
INSERT INTO learning_jdbc.books VALUES (34, 'Aerified', 6, 1125);
INSERT INTO learning_jdbc.books VALUES (35, 'Pannier', 22, 1381);
INSERT INTO learning_jdbc.books VALUES (36, 'Flexidy', 6, 248);
INSERT INTO learning_jdbc.books VALUES (37, 'Toughjoyfax', 14, 1452);
INSERT INTO learning_jdbc.books VALUES (38, 'Overhold', 33, 1461);
INSERT INTO learning_jdbc.books VALUES (39, 'Sub-Ex', 40, 1488);
INSERT INTO learning_jdbc.books VALUES (40, 'Ventosanzap', 1, 756);
INSERT INTO learning_jdbc.books VALUES (41, 'Bitchip', 28, 1386);
INSERT INTO learning_jdbc.books VALUES (42, 'Bamity', 28, 1145);
INSERT INTO learning_jdbc.books VALUES (43, 'Alphazap', 26, 1326);
INSERT INTO learning_jdbc.books VALUES (44, 'Cookley', 9, 80);
INSERT INTO learning_jdbc.books VALUES (45, 'Biodex', 15, 1473);
INSERT INTO learning_jdbc.books VALUES (46, 'Tresom', 14, 94);
INSERT INTO learning_jdbc.books VALUES (47, 'Keylex', 34, 174);
INSERT INTO learning_jdbc.books VALUES (48, 'Temp', 3, 698);
INSERT INTO learning_jdbc.books VALUES (49, 'Zoolab', 24, 857);
INSERT INTO learning_jdbc.books VALUES (50, 'Tres-Zap', 22, 391);
INSERT INTO learning_jdbc.books VALUES (51, 'Andalax', 36, 705);
INSERT INTO learning_jdbc.books VALUES (52, 'Opela', 29, 267);
INSERT INTO learning_jdbc.books VALUES (53, 'Treeflex', 37, 591);
INSERT INTO learning_jdbc.books VALUES (54, 'Voltsillam', 34, 235);
INSERT INTO learning_jdbc.books VALUES (55, 'Daltfresh', 36, 464);
INSERT INTO learning_jdbc.books VALUES (56, 'Cardify', 9, 589);
INSERT INTO learning_jdbc.books VALUES (57, 'Asoka', 8, 1048);
INSERT INTO learning_jdbc.books VALUES (58, 'Rank', 31, 1490);
INSERT INTO learning_jdbc.books VALUES (59, 'Subin', 6, 1134);
INSERT INTO learning_jdbc.books VALUES (60, 'Greenlam', 2, 42);
INSERT INTO learning_jdbc.books VALUES (61, 'Zontrax', 11, 764);
INSERT INTO learning_jdbc.books VALUES (62, 'Konklab', 24, 1040);
INSERT INTO learning_jdbc.books VALUES (63, 'Zaam-Dox', 12, 214);
INSERT INTO learning_jdbc.books VALUES (64, 'Mat Lam Tam', 36, 331);
INSERT INTO learning_jdbc.books VALUES (65, 'Stringtough', 24, 549);
INSERT INTO learning_jdbc.books VALUES (66, 'Y-Solowarm', 10, 586);
INSERT INTO learning_jdbc.books VALUES (67, 'Otcom', 13, 994);
INSERT INTO learning_jdbc.books VALUES (68, 'Hatity', 6, 286);
INSERT INTO learning_jdbc.books VALUES (69, 'Zamit', 26, 516);
INSERT INTO learning_jdbc.books VALUES (70, 'Fix San', 39, 1095);
INSERT INTO learning_jdbc.books VALUES (71, 'Domainer', 24, 1111);
INSERT INTO learning_jdbc.books VALUES (72, 'Sonair', 28, 355);
INSERT INTO learning_jdbc.books VALUES (73, 'Job', 11, 1253);
INSERT INTO learning_jdbc.books VALUES (74, 'Redhold', 23, 1364);
INSERT INTO learning_jdbc.books VALUES (75, 'Lotlux', 28, 1324);
INSERT INTO learning_jdbc.books VALUES (76, 'Vagram', 8, 199);
INSERT INTO learning_jdbc.books VALUES (77, 'Y-find', 3, 421);
INSERT INTO learning_jdbc.books VALUES (78, 'It', 27, 1035);
INSERT INTO learning_jdbc.books VALUES (79, 'Alpha', 5, 1430);
INSERT INTO learning_jdbc.books VALUES (80, 'Lotstring', 37, 264);
INSERT INTO learning_jdbc.books VALUES (81, 'Tempsoft', 28, 89);
INSERT INTO learning_jdbc.books VALUES (128, 'The Story Of Univerce', 41, 623);
INSERT INTO learning_jdbc.books VALUES (129, 'NEW_TEST_BOOK', 1, 500);


--
-- TOC entry 3127 (class 0 OID 16834)
-- Dependencies: 209
-- Data for Name: books_authors; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.books_authors VALUES (2, 26);
INSERT INTO learning_jdbc.books_authors VALUES (2, 33);
INSERT INTO learning_jdbc.books_authors VALUES (2, 76);
INSERT INTO learning_jdbc.books_authors VALUES (3, 30);
INSERT INTO learning_jdbc.books_authors VALUES (3, 38);
INSERT INTO learning_jdbc.books_authors VALUES (3, 80);
INSERT INTO learning_jdbc.books_authors VALUES (4, 5);
INSERT INTO learning_jdbc.books_authors VALUES (4, 55);
INSERT INTO learning_jdbc.books_authors VALUES (4, 70);
INSERT INTO learning_jdbc.books_authors VALUES (4, 72);
INSERT INTO learning_jdbc.books_authors VALUES (4, 74);
INSERT INTO learning_jdbc.books_authors VALUES (5, 3);
INSERT INTO learning_jdbc.books_authors VALUES (5, 41);
INSERT INTO learning_jdbc.books_authors VALUES (5, 52);
INSERT INTO learning_jdbc.books_authors VALUES (5, 59);
INSERT INTO learning_jdbc.books_authors VALUES (6, 76);
INSERT INTO learning_jdbc.books_authors VALUES (7, 25);
INSERT INTO learning_jdbc.books_authors VALUES (7, 44);
INSERT INTO learning_jdbc.books_authors VALUES (7, 45);
INSERT INTO learning_jdbc.books_authors VALUES (8, 29);
INSERT INTO learning_jdbc.books_authors VALUES (8, 36);
INSERT INTO learning_jdbc.books_authors VALUES (8, 42);
INSERT INTO learning_jdbc.books_authors VALUES (8, 57);
INSERT INTO learning_jdbc.books_authors VALUES (9, 33);
INSERT INTO learning_jdbc.books_authors VALUES (9, 40);
INSERT INTO learning_jdbc.books_authors VALUES (10, 29);
INSERT INTO learning_jdbc.books_authors VALUES (10, 45);
INSERT INTO learning_jdbc.books_authors VALUES (10, 47);
INSERT INTO learning_jdbc.books_authors VALUES (10, 52);
INSERT INTO learning_jdbc.books_authors VALUES (11, 73);
INSERT INTO learning_jdbc.books_authors VALUES (12, 17);
INSERT INTO learning_jdbc.books_authors VALUES (13, 11);
INSERT INTO learning_jdbc.books_authors VALUES (13, 40);
INSERT INTO learning_jdbc.books_authors VALUES (14, 62);
INSERT INTO learning_jdbc.books_authors VALUES (15, 32);
INSERT INTO learning_jdbc.books_authors VALUES (15, 46);
INSERT INTO learning_jdbc.books_authors VALUES (15, 60);
INSERT INTO learning_jdbc.books_authors VALUES (15, 65);
INSERT INTO learning_jdbc.books_authors VALUES (16, 26);
INSERT INTO learning_jdbc.books_authors VALUES (16, 41);
INSERT INTO learning_jdbc.books_authors VALUES (16, 64);
INSERT INTO learning_jdbc.books_authors VALUES (16, 78);
INSERT INTO learning_jdbc.books_authors VALUES (17, 13);
INSERT INTO learning_jdbc.books_authors VALUES (18, 31);
INSERT INTO learning_jdbc.books_authors VALUES (18, 55);
INSERT INTO learning_jdbc.books_authors VALUES (19, 23);
INSERT INTO learning_jdbc.books_authors VALUES (19, 30);
INSERT INTO learning_jdbc.books_authors VALUES (20, 5);
INSERT INTO learning_jdbc.books_authors VALUES (20, 22);
INSERT INTO learning_jdbc.books_authors VALUES (20, 44);
INSERT INTO learning_jdbc.books_authors VALUES (20, 73);
INSERT INTO learning_jdbc.books_authors VALUES (21, 4);
INSERT INTO learning_jdbc.books_authors VALUES (21, 19);
INSERT INTO learning_jdbc.books_authors VALUES (21, 55);
INSERT INTO learning_jdbc.books_authors VALUES (22, 29);
INSERT INTO learning_jdbc.books_authors VALUES (22, 37);
INSERT INTO learning_jdbc.books_authors VALUES (22, 65);
INSERT INTO learning_jdbc.books_authors VALUES (22, 79);
INSERT INTO learning_jdbc.books_authors VALUES (23, 18);
INSERT INTO learning_jdbc.books_authors VALUES (23, 35);
INSERT INTO learning_jdbc.books_authors VALUES (24, 2);
INSERT INTO learning_jdbc.books_authors VALUES (24, 37);
INSERT INTO learning_jdbc.books_authors VALUES (24, 72);
INSERT INTO learning_jdbc.books_authors VALUES (25, 19);
INSERT INTO learning_jdbc.books_authors VALUES (25, 33);
INSERT INTO learning_jdbc.books_authors VALUES (25, 37);
INSERT INTO learning_jdbc.books_authors VALUES (25, 58);
INSERT INTO learning_jdbc.books_authors VALUES (25, 67);
INSERT INTO learning_jdbc.books_authors VALUES (25, 71);
INSERT INTO learning_jdbc.books_authors VALUES (26, 9);
INSERT INTO learning_jdbc.books_authors VALUES (27, 7);
INSERT INTO learning_jdbc.books_authors VALUES (27, 62);
INSERT INTO learning_jdbc.books_authors VALUES (27, 63);
INSERT INTO learning_jdbc.books_authors VALUES (27, 77);
INSERT INTO learning_jdbc.books_authors VALUES (27, 81);
INSERT INTO learning_jdbc.books_authors VALUES (29, 9);
INSERT INTO learning_jdbc.books_authors VALUES (29, 22);
INSERT INTO learning_jdbc.books_authors VALUES (30, 9);
INSERT INTO learning_jdbc.books_authors VALUES (30, 10);
INSERT INTO learning_jdbc.books_authors VALUES (30, 44);
INSERT INTO learning_jdbc.books_authors VALUES (31, 18);
INSERT INTO learning_jdbc.books_authors VALUES (31, 23);
INSERT INTO learning_jdbc.books_authors VALUES (31, 46);
INSERT INTO learning_jdbc.books_authors VALUES (31, 53);
INSERT INTO learning_jdbc.books_authors VALUES (31, 60);
INSERT INTO learning_jdbc.books_authors VALUES (31, 72);
INSERT INTO learning_jdbc.books_authors VALUES (32, 20);
INSERT INTO learning_jdbc.books_authors VALUES (32, 39);
INSERT INTO learning_jdbc.books_authors VALUES (33, 6);
INSERT INTO learning_jdbc.books_authors VALUES (33, 66);
INSERT INTO learning_jdbc.books_authors VALUES (34, 5);
INSERT INTO learning_jdbc.books_authors VALUES (34, 6);
INSERT INTO learning_jdbc.books_authors VALUES (34, 39);
INSERT INTO learning_jdbc.books_authors VALUES (34, 52);
INSERT INTO learning_jdbc.books_authors VALUES (34, 56);
INSERT INTO learning_jdbc.books_authors VALUES (34, 73);
INSERT INTO learning_jdbc.books_authors VALUES (34, 76);
INSERT INTO learning_jdbc.books_authors VALUES (34, 80);
INSERT INTO learning_jdbc.books_authors VALUES (35, 4);
INSERT INTO learning_jdbc.books_authors VALUES (35, 8);
INSERT INTO learning_jdbc.books_authors VALUES (35, 26);
INSERT INTO learning_jdbc.books_authors VALUES (35, 36);
INSERT INTO learning_jdbc.books_authors VALUES (35, 63);
INSERT INTO learning_jdbc.books_authors VALUES (35, 78);
INSERT INTO learning_jdbc.books_authors VALUES (36, 64);
INSERT INTO learning_jdbc.books_authors VALUES (36, 68);
INSERT INTO learning_jdbc.books_authors VALUES (36, 73);
INSERT INTO learning_jdbc.books_authors VALUES (36, 75);
INSERT INTO learning_jdbc.books_authors VALUES (37, 25);
INSERT INTO learning_jdbc.books_authors VALUES (37, 36);
INSERT INTO learning_jdbc.books_authors VALUES (37, 44);
INSERT INTO learning_jdbc.books_authors VALUES (37, 45);
INSERT INTO learning_jdbc.books_authors VALUES (37, 48);
INSERT INTO learning_jdbc.books_authors VALUES (38, 14);
INSERT INTO learning_jdbc.books_authors VALUES (38, 15);
INSERT INTO learning_jdbc.books_authors VALUES (38, 26);
INSERT INTO learning_jdbc.books_authors VALUES (38, 37);
INSERT INTO learning_jdbc.books_authors VALUES (38, 42);
INSERT INTO learning_jdbc.books_authors VALUES (38, 44);
INSERT INTO learning_jdbc.books_authors VALUES (38, 50);
INSERT INTO learning_jdbc.books_authors VALUES (38, 69);
INSERT INTO learning_jdbc.books_authors VALUES (39, 17);
INSERT INTO learning_jdbc.books_authors VALUES (39, 22);
INSERT INTO learning_jdbc.books_authors VALUES (39, 34);
INSERT INTO learning_jdbc.books_authors VALUES (39, 37);
INSERT INTO learning_jdbc.books_authors VALUES (39, 46);
INSERT INTO learning_jdbc.books_authors VALUES (39, 53);
INSERT INTO learning_jdbc.books_authors VALUES (39, 78);
INSERT INTO learning_jdbc.books_authors VALUES (41, 1);
INSERT INTO learning_jdbc.books_authors VALUES (41, 2);
INSERT INTO learning_jdbc.books_authors VALUES (41, 38);
INSERT INTO learning_jdbc.books_authors VALUES (41, 61);
INSERT INTO learning_jdbc.books_authors VALUES (41, 73);
INSERT INTO learning_jdbc.books_authors VALUES (42, 12);
INSERT INTO learning_jdbc.books_authors VALUES (42, 71);
INSERT INTO learning_jdbc.books_authors VALUES (43, 72);
INSERT INTO learning_jdbc.books_authors VALUES (44, 10);
INSERT INTO learning_jdbc.books_authors VALUES (44, 24);
INSERT INTO learning_jdbc.books_authors VALUES (44, 66);
INSERT INTO learning_jdbc.books_authors VALUES (45, 20);
INSERT INTO learning_jdbc.books_authors VALUES (45, 44);
INSERT INTO learning_jdbc.books_authors VALUES (46, 2);
INSERT INTO learning_jdbc.books_authors VALUES (46, 7);
INSERT INTO learning_jdbc.books_authors VALUES (46, 36);
INSERT INTO learning_jdbc.books_authors VALUES (46, 45);
INSERT INTO learning_jdbc.books_authors VALUES (46, 69);
INSERT INTO learning_jdbc.books_authors VALUES (48, 7);
INSERT INTO learning_jdbc.books_authors VALUES (50, 15);
INSERT INTO learning_jdbc.books_authors VALUES (50, 32);
INSERT INTO learning_jdbc.books_authors VALUES (50, 44);
INSERT INTO learning_jdbc.books_authors VALUES (50, 64);
INSERT INTO learning_jdbc.books_authors VALUES (50, 69);
INSERT INTO learning_jdbc.books_authors VALUES (51, 17);
INSERT INTO learning_jdbc.books_authors VALUES (51, 27);
INSERT INTO learning_jdbc.books_authors VALUES (51, 30);
INSERT INTO learning_jdbc.books_authors VALUES (51, 42);
INSERT INTO learning_jdbc.books_authors VALUES (52, 9);
INSERT INTO learning_jdbc.books_authors VALUES (52, 31);
INSERT INTO learning_jdbc.books_authors VALUES (52, 45);
INSERT INTO learning_jdbc.books_authors VALUES (52, 78);
INSERT INTO learning_jdbc.books_authors VALUES (53, 51);
INSERT INTO learning_jdbc.books_authors VALUES (54, 5);
INSERT INTO learning_jdbc.books_authors VALUES (54, 9);
INSERT INTO learning_jdbc.books_authors VALUES (54, 76);
INSERT INTO learning_jdbc.books_authors VALUES (55, 23);
INSERT INTO learning_jdbc.books_authors VALUES (55, 40);
INSERT INTO learning_jdbc.books_authors VALUES (55, 49);
INSERT INTO learning_jdbc.books_authors VALUES (56, 12);
INSERT INTO learning_jdbc.books_authors VALUES (56, 20);
INSERT INTO learning_jdbc.books_authors VALUES (56, 72);
INSERT INTO learning_jdbc.books_authors VALUES (57, 30);
INSERT INTO learning_jdbc.books_authors VALUES (57, 47);
INSERT INTO learning_jdbc.books_authors VALUES (57, 53);
INSERT INTO learning_jdbc.books_authors VALUES (57, 59);
INSERT INTO learning_jdbc.books_authors VALUES (57, 60);
INSERT INTO learning_jdbc.books_authors VALUES (57, 67);
INSERT INTO learning_jdbc.books_authors VALUES (57, 71);
INSERT INTO learning_jdbc.books_authors VALUES (58, 35);
INSERT INTO learning_jdbc.books_authors VALUES (58, 36);
INSERT INTO learning_jdbc.books_authors VALUES (58, 58);
INSERT INTO learning_jdbc.books_authors VALUES (58, 78);
INSERT INTO learning_jdbc.books_authors VALUES (59, 14);
INSERT INTO learning_jdbc.books_authors VALUES (59, 33);
INSERT INTO learning_jdbc.books_authors VALUES (59, 34);
INSERT INTO learning_jdbc.books_authors VALUES (59, 43);
INSERT INTO learning_jdbc.books_authors VALUES (59, 45);
INSERT INTO learning_jdbc.books_authors VALUES (59, 68);
INSERT INTO learning_jdbc.books_authors VALUES (62, 20);
INSERT INTO learning_jdbc.books_authors VALUES (62, 23);
INSERT INTO learning_jdbc.books_authors VALUES (62, 66);
INSERT INTO learning_jdbc.books_authors VALUES (62, 75);
INSERT INTO learning_jdbc.books_authors VALUES (63, 3);
INSERT INTO learning_jdbc.books_authors VALUES (63, 8);
INSERT INTO learning_jdbc.books_authors VALUES (63, 39);
INSERT INTO learning_jdbc.books_authors VALUES (63, 53);
INSERT INTO learning_jdbc.books_authors VALUES (63, 62);
INSERT INTO learning_jdbc.books_authors VALUES (63, 70);
INSERT INTO learning_jdbc.books_authors VALUES (64, 1);
INSERT INTO learning_jdbc.books_authors VALUES (64, 4);
INSERT INTO learning_jdbc.books_authors VALUES (64, 40);
INSERT INTO learning_jdbc.books_authors VALUES (64, 49);
INSERT INTO learning_jdbc.books_authors VALUES (64, 52);
INSERT INTO learning_jdbc.books_authors VALUES (65, 22);
INSERT INTO learning_jdbc.books_authors VALUES (65, 40);
INSERT INTO learning_jdbc.books_authors VALUES (65, 62);
INSERT INTO learning_jdbc.books_authors VALUES (66, 1);
INSERT INTO learning_jdbc.books_authors VALUES (66, 24);
INSERT INTO learning_jdbc.books_authors VALUES (66, 28);
INSERT INTO learning_jdbc.books_authors VALUES (66, 35);
INSERT INTO learning_jdbc.books_authors VALUES (66, 60);
INSERT INTO learning_jdbc.books_authors VALUES (67, 10);
INSERT INTO learning_jdbc.books_authors VALUES (67, 63);
INSERT INTO learning_jdbc.books_authors VALUES (67, 67);
INSERT INTO learning_jdbc.books_authors VALUES (67, 70);
INSERT INTO learning_jdbc.books_authors VALUES (68, 28);
INSERT INTO learning_jdbc.books_authors VALUES (68, 32);
INSERT INTO learning_jdbc.books_authors VALUES (68, 42);
INSERT INTO learning_jdbc.books_authors VALUES (68, 66);
INSERT INTO learning_jdbc.books_authors VALUES (69, 37);
INSERT INTO learning_jdbc.books_authors VALUES (70, 59);
INSERT INTO learning_jdbc.books_authors VALUES (71, 8);
INSERT INTO learning_jdbc.books_authors VALUES (71, 39);
INSERT INTO learning_jdbc.books_authors VALUES (71, 54);
INSERT INTO learning_jdbc.books_authors VALUES (72, 22);
INSERT INTO learning_jdbc.books_authors VALUES (72, 39);
INSERT INTO learning_jdbc.books_authors VALUES (72, 79);
INSERT INTO learning_jdbc.books_authors VALUES (73, 1);
INSERT INTO learning_jdbc.books_authors VALUES (74, 18);
INSERT INTO learning_jdbc.books_authors VALUES (75, 36);
INSERT INTO learning_jdbc.books_authors VALUES (75, 79);
INSERT INTO learning_jdbc.books_authors VALUES (76, 27);
INSERT INTO learning_jdbc.books_authors VALUES (77, 27);
INSERT INTO learning_jdbc.books_authors VALUES (77, 65);
INSERT INTO learning_jdbc.books_authors VALUES (78, 8);
INSERT INTO learning_jdbc.books_authors VALUES (78, 27);
INSERT INTO learning_jdbc.books_authors VALUES (78, 41);
INSERT INTO learning_jdbc.books_authors VALUES (78, 68);
INSERT INTO learning_jdbc.books_authors VALUES (79, 8);
INSERT INTO learning_jdbc.books_authors VALUES (79, 13);
INSERT INTO learning_jdbc.books_authors VALUES (79, 19);
INSERT INTO learning_jdbc.books_authors VALUES (79, 25);
INSERT INTO learning_jdbc.books_authors VALUES (79, 51);
INSERT INTO learning_jdbc.books_authors VALUES (79, 81);
INSERT INTO learning_jdbc.books_authors VALUES (80, 20);
INSERT INTO learning_jdbc.books_authors VALUES (80, 35);
INSERT INTO learning_jdbc.books_authors VALUES (80, 61);
INSERT INTO learning_jdbc.books_authors VALUES (80, 76);
INSERT INTO learning_jdbc.books_authors VALUES (82, 65);
INSERT INTO learning_jdbc.books_authors VALUES (82, 76);
INSERT INTO learning_jdbc.books_authors VALUES (83, 17);
INSERT INTO learning_jdbc.books_authors VALUES (83, 22);
INSERT INTO learning_jdbc.books_authors VALUES (83, 27);
INSERT INTO learning_jdbc.books_authors VALUES (83, 80);
INSERT INTO learning_jdbc.books_authors VALUES (85, 1);
INSERT INTO learning_jdbc.books_authors VALUES (85, 41);
INSERT INTO learning_jdbc.books_authors VALUES (85, 58);
INSERT INTO learning_jdbc.books_authors VALUES (85, 81);
INSERT INTO learning_jdbc.books_authors VALUES (86, 27);
INSERT INTO learning_jdbc.books_authors VALUES (87, 2);
INSERT INTO learning_jdbc.books_authors VALUES (87, 37);
INSERT INTO learning_jdbc.books_authors VALUES (87, 63);
INSERT INTO learning_jdbc.books_authors VALUES (88, 46);
INSERT INTO learning_jdbc.books_authors VALUES (89, 45);
INSERT INTO learning_jdbc.books_authors VALUES (89, 68);
INSERT INTO learning_jdbc.books_authors VALUES (90, 7);
INSERT INTO learning_jdbc.books_authors VALUES (90, 12);
INSERT INTO learning_jdbc.books_authors VALUES (90, 70);
INSERT INTO learning_jdbc.books_authors VALUES (90, 75);
INSERT INTO learning_jdbc.books_authors VALUES (91, 35);
INSERT INTO learning_jdbc.books_authors VALUES (91, 53);
INSERT INTO learning_jdbc.books_authors VALUES (93, 10);
INSERT INTO learning_jdbc.books_authors VALUES (93, 16);
INSERT INTO learning_jdbc.books_authors VALUES (93, 18);
INSERT INTO learning_jdbc.books_authors VALUES (93, 21);
INSERT INTO learning_jdbc.books_authors VALUES (93, 32);
INSERT INTO learning_jdbc.books_authors VALUES (93, 72);
INSERT INTO learning_jdbc.books_authors VALUES (93, 75);
INSERT INTO learning_jdbc.books_authors VALUES (94, 32);
INSERT INTO learning_jdbc.books_authors VALUES (94, 38);
INSERT INTO learning_jdbc.books_authors VALUES (94, 66);
INSERT INTO learning_jdbc.books_authors VALUES (94, 79);
INSERT INTO learning_jdbc.books_authors VALUES (96, 70);
INSERT INTO learning_jdbc.books_authors VALUES (97, 45);
INSERT INTO learning_jdbc.books_authors VALUES (98, 37);
INSERT INTO learning_jdbc.books_authors VALUES (98, 48);
INSERT INTO learning_jdbc.books_authors VALUES (98, 57);
INSERT INTO learning_jdbc.books_authors VALUES (98, 78);
INSERT INTO learning_jdbc.books_authors VALUES (99, 3);
INSERT INTO learning_jdbc.books_authors VALUES (99, 9);
INSERT INTO learning_jdbc.books_authors VALUES (99, 33);
INSERT INTO learning_jdbc.books_authors VALUES (99, 39);
INSERT INTO learning_jdbc.books_authors VALUES (99, 42);
INSERT INTO learning_jdbc.books_authors VALUES (99, 47);
INSERT INTO learning_jdbc.books_authors VALUES (99, 66);
INSERT INTO learning_jdbc.books_authors VALUES (100, 17);
INSERT INTO learning_jdbc.books_authors VALUES (100, 26);
INSERT INTO learning_jdbc.books_authors VALUES (100, 51);
INSERT INTO learning_jdbc.books_authors VALUES (100, 56);
INSERT INTO learning_jdbc.books_authors VALUES (100, 57);
INSERT INTO learning_jdbc.books_authors VALUES (100, 63);
INSERT INTO learning_jdbc.books_authors VALUES (100, 74);
INSERT INTO learning_jdbc.books_authors VALUES (100, 79);
INSERT INTO learning_jdbc.books_authors VALUES (101, 16);
INSERT INTO learning_jdbc.books_authors VALUES (101, 35);
INSERT INTO learning_jdbc.books_authors VALUES (101, 46);
INSERT INTO learning_jdbc.books_authors VALUES (102, 33);
INSERT INTO learning_jdbc.books_authors VALUES (102, 71);
INSERT INTO learning_jdbc.books_authors VALUES (103, 6);
INSERT INTO learning_jdbc.books_authors VALUES (103, 23);
INSERT INTO learning_jdbc.books_authors VALUES (103, 41);
INSERT INTO learning_jdbc.books_authors VALUES (103, 52);
INSERT INTO learning_jdbc.books_authors VALUES (103, 77);
INSERT INTO learning_jdbc.books_authors VALUES (104, 48);
INSERT INTO learning_jdbc.books_authors VALUES (105, 29);
INSERT INTO learning_jdbc.books_authors VALUES (105, 32);
INSERT INTO learning_jdbc.books_authors VALUES (105, 67);
INSERT INTO learning_jdbc.books_authors VALUES (106, 39);
INSERT INTO learning_jdbc.books_authors VALUES (106, 46);
INSERT INTO learning_jdbc.books_authors VALUES (108, 25);
INSERT INTO learning_jdbc.books_authors VALUES (109, 2);
INSERT INTO learning_jdbc.books_authors VALUES (109, 5);
INSERT INTO learning_jdbc.books_authors VALUES (109, 15);
INSERT INTO learning_jdbc.books_authors VALUES (109, 67);
INSERT INTO learning_jdbc.books_authors VALUES (109, 71);
INSERT INTO learning_jdbc.books_authors VALUES (109, 72);
INSERT INTO learning_jdbc.books_authors VALUES (110, 1);
INSERT INTO learning_jdbc.books_authors VALUES (110, 5);
INSERT INTO learning_jdbc.books_authors VALUES (110, 16);
INSERT INTO learning_jdbc.books_authors VALUES (110, 52);
INSERT INTO learning_jdbc.books_authors VALUES (110, 80);
INSERT INTO learning_jdbc.books_authors VALUES (111, 15);
INSERT INTO learning_jdbc.books_authors VALUES (111, 24);
INSERT INTO learning_jdbc.books_authors VALUES (111, 38);
INSERT INTO learning_jdbc.books_authors VALUES (111, 55);
INSERT INTO learning_jdbc.books_authors VALUES (112, 13);
INSERT INTO learning_jdbc.books_authors VALUES (112, 61);
INSERT INTO learning_jdbc.books_authors VALUES (112, 68);
INSERT INTO learning_jdbc.books_authors VALUES (113, 10);
INSERT INTO learning_jdbc.books_authors VALUES (113, 25);
INSERT INTO learning_jdbc.books_authors VALUES (113, 73);
INSERT INTO learning_jdbc.books_authors VALUES (114, 6);
INSERT INTO learning_jdbc.books_authors VALUES (114, 42);
INSERT INTO learning_jdbc.books_authors VALUES (114, 53);
INSERT INTO learning_jdbc.books_authors VALUES (114, 64);
INSERT INTO learning_jdbc.books_authors VALUES (115, 54);
INSERT INTO learning_jdbc.books_authors VALUES (116, 68);
INSERT INTO learning_jdbc.books_authors VALUES (116, 72);
INSERT INTO learning_jdbc.books_authors VALUES (117, 1);
INSERT INTO learning_jdbc.books_authors VALUES (117, 50);
INSERT INTO learning_jdbc.books_authors VALUES (118, 45);
INSERT INTO learning_jdbc.books_authors VALUES (118, 55);
INSERT INTO learning_jdbc.books_authors VALUES (118, 79);
INSERT INTO learning_jdbc.books_authors VALUES (119, 1);
INSERT INTO learning_jdbc.books_authors VALUES (119, 10);
INSERT INTO learning_jdbc.books_authors VALUES (119, 18);
INSERT INTO learning_jdbc.books_authors VALUES (119, 31);
INSERT INTO learning_jdbc.books_authors VALUES (119, 39);
INSERT INTO learning_jdbc.books_authors VALUES (119, 50);
INSERT INTO learning_jdbc.books_authors VALUES (119, 52);
INSERT INTO learning_jdbc.books_authors VALUES (119, 57);
INSERT INTO learning_jdbc.books_authors VALUES (119, 60);
INSERT INTO learning_jdbc.books_authors VALUES (120, 64);
INSERT INTO learning_jdbc.books_authors VALUES (120, 77);
INSERT INTO learning_jdbc.books_authors VALUES (121, 35);
INSERT INTO learning_jdbc.books_authors VALUES (122, 33);
INSERT INTO learning_jdbc.books_authors VALUES (123, 12);
INSERT INTO learning_jdbc.books_authors VALUES (123, 17);
INSERT INTO learning_jdbc.books_authors VALUES (123, 44);
INSERT INTO learning_jdbc.books_authors VALUES (123, 45);
INSERT INTO learning_jdbc.books_authors VALUES (124, 3);
INSERT INTO learning_jdbc.books_authors VALUES (124, 9);
INSERT INTO learning_jdbc.books_authors VALUES (124, 52);
INSERT INTO learning_jdbc.books_authors VALUES (124, 55);
INSERT INTO learning_jdbc.books_authors VALUES (125, 23);
INSERT INTO learning_jdbc.books_authors VALUES (125, 39);
INSERT INTO learning_jdbc.books_authors VALUES (125, 42);
INSERT INTO learning_jdbc.books_authors VALUES (125, 43);
INSERT INTO learning_jdbc.books_authors VALUES (125, 48);
INSERT INTO learning_jdbc.books_authors VALUES (125, 69);
INSERT INTO learning_jdbc.books_authors VALUES (126, 27);
INSERT INTO learning_jdbc.books_authors VALUES (126, 49);
INSERT INTO learning_jdbc.books_authors VALUES (126, 56);
INSERT INTO learning_jdbc.books_authors VALUES (127, 4);
INSERT INTO learning_jdbc.books_authors VALUES (127, 15);
INSERT INTO learning_jdbc.books_authors VALUES (128, 70);
INSERT INTO learning_jdbc.books_authors VALUES (129, 60);
INSERT INTO learning_jdbc.books_authors VALUES (129, 73);
INSERT INTO learning_jdbc.books_authors VALUES (130, 3);
INSERT INTO learning_jdbc.books_authors VALUES (130, 17);
INSERT INTO learning_jdbc.books_authors VALUES (130, 42);
INSERT INTO learning_jdbc.books_authors VALUES (130, 46);
INSERT INTO learning_jdbc.books_authors VALUES (130, 65);
INSERT INTO learning_jdbc.books_authors VALUES (131, 35);
INSERT INTO learning_jdbc.books_authors VALUES (131, 62);
INSERT INTO learning_jdbc.books_authors VALUES (131, 81);
INSERT INTO learning_jdbc.books_authors VALUES (132, 26);
INSERT INTO learning_jdbc.books_authors VALUES (132, 66);
INSERT INTO learning_jdbc.books_authors VALUES (133, 25);
INSERT INTO learning_jdbc.books_authors VALUES (133, 61);
INSERT INTO learning_jdbc.books_authors VALUES (134, 1);
INSERT INTO learning_jdbc.books_authors VALUES (134, 33);
INSERT INTO learning_jdbc.books_authors VALUES (134, 38);
INSERT INTO learning_jdbc.books_authors VALUES (134, 60);
INSERT INTO learning_jdbc.books_authors VALUES (134, 66);
INSERT INTO learning_jdbc.books_authors VALUES (135, 12);
INSERT INTO learning_jdbc.books_authors VALUES (135, 44);
INSERT INTO learning_jdbc.books_authors VALUES (136, 7);
INSERT INTO learning_jdbc.books_authors VALUES (137, 43);
INSERT INTO learning_jdbc.books_authors VALUES (137, 63);
INSERT INTO learning_jdbc.books_authors VALUES (138, 23);
INSERT INTO learning_jdbc.books_authors VALUES (139, 57);
INSERT INTO learning_jdbc.books_authors VALUES (140, 72);
INSERT INTO learning_jdbc.books_authors VALUES (141, 11);
INSERT INTO learning_jdbc.books_authors VALUES (141, 42);
INSERT INTO learning_jdbc.books_authors VALUES (142, 1);
INSERT INTO learning_jdbc.books_authors VALUES (142, 37);
INSERT INTO learning_jdbc.books_authors VALUES (143, 3);
INSERT INTO learning_jdbc.books_authors VALUES (143, 33);
INSERT INTO learning_jdbc.books_authors VALUES (143, 49);
INSERT INTO learning_jdbc.books_authors VALUES (145, 12);
INSERT INTO learning_jdbc.books_authors VALUES (146, 20);
INSERT INTO learning_jdbc.books_authors VALUES (146, 29);
INSERT INTO learning_jdbc.books_authors VALUES (146, 41);
INSERT INTO learning_jdbc.books_authors VALUES (148, 4);
INSERT INTO learning_jdbc.books_authors VALUES (148, 75);
INSERT INTO learning_jdbc.books_authors VALUES (149, 9);
INSERT INTO learning_jdbc.books_authors VALUES (149, 44);
INSERT INTO learning_jdbc.books_authors VALUES (149, 46);
INSERT INTO learning_jdbc.books_authors VALUES (149, 49);
INSERT INTO learning_jdbc.books_authors VALUES (149, 58);
INSERT INTO learning_jdbc.books_authors VALUES (151, 13);
INSERT INTO learning_jdbc.books_authors VALUES (151, 55);
INSERT INTO learning_jdbc.books_authors VALUES (151, 73);
INSERT INTO learning_jdbc.books_authors VALUES (152, 16);
INSERT INTO learning_jdbc.books_authors VALUES (153, 34);
INSERT INTO learning_jdbc.books_authors VALUES (154, 71);
INSERT INTO learning_jdbc.books_authors VALUES (155, 30);
INSERT INTO learning_jdbc.books_authors VALUES (155, 35);
INSERT INTO learning_jdbc.books_authors VALUES (156, 3);
INSERT INTO learning_jdbc.books_authors VALUES (156, 6);
INSERT INTO learning_jdbc.books_authors VALUES (156, 41);
INSERT INTO learning_jdbc.books_authors VALUES (156, 56);
INSERT INTO learning_jdbc.books_authors VALUES (156, 69);
INSERT INTO learning_jdbc.books_authors VALUES (156, 77);
INSERT INTO learning_jdbc.books_authors VALUES (156, 81);
INSERT INTO learning_jdbc.books_authors VALUES (157, 1);
INSERT INTO learning_jdbc.books_authors VALUES (157, 8);
INSERT INTO learning_jdbc.books_authors VALUES (157, 39);
INSERT INTO learning_jdbc.books_authors VALUES (157, 41);
INSERT INTO learning_jdbc.books_authors VALUES (157, 47);
INSERT INTO learning_jdbc.books_authors VALUES (158, 50);
INSERT INTO learning_jdbc.books_authors VALUES (158, 66);
INSERT INTO learning_jdbc.books_authors VALUES (159, 31);
INSERT INTO learning_jdbc.books_authors VALUES (159, 43);
INSERT INTO learning_jdbc.books_authors VALUES (160, 17);
INSERT INTO learning_jdbc.books_authors VALUES (160, 61);
INSERT INTO learning_jdbc.books_authors VALUES (161, 35);
INSERT INTO learning_jdbc.books_authors VALUES (161, 44);
INSERT INTO learning_jdbc.books_authors VALUES (162, 2);
INSERT INTO learning_jdbc.books_authors VALUES (162, 44);
INSERT INTO learning_jdbc.books_authors VALUES (162, 78);
INSERT INTO learning_jdbc.books_authors VALUES (163, 37);
INSERT INTO learning_jdbc.books_authors VALUES (163, 70);
INSERT INTO learning_jdbc.books_authors VALUES (163, 78);
INSERT INTO learning_jdbc.books_authors VALUES (164, 7);
INSERT INTO learning_jdbc.books_authors VALUES (164, 71);
INSERT INTO learning_jdbc.books_authors VALUES (165, 18);
INSERT INTO learning_jdbc.books_authors VALUES (165, 67);
INSERT INTO learning_jdbc.books_authors VALUES (166, 21);
INSERT INTO learning_jdbc.books_authors VALUES (166, 65);
INSERT INTO learning_jdbc.books_authors VALUES (166, 66);
INSERT INTO learning_jdbc.books_authors VALUES (167, 8);
INSERT INTO learning_jdbc.books_authors VALUES (167, 46);
INSERT INTO learning_jdbc.books_authors VALUES (167, 57);
INSERT INTO learning_jdbc.books_authors VALUES (167, 59);
INSERT INTO learning_jdbc.books_authors VALUES (167, 80);
INSERT INTO learning_jdbc.books_authors VALUES (168, 8);
INSERT INTO learning_jdbc.books_authors VALUES (168, 23);
INSERT INTO learning_jdbc.books_authors VALUES (168, 32);
INSERT INTO learning_jdbc.books_authors VALUES (168, 59);
INSERT INTO learning_jdbc.books_authors VALUES (168, 73);
INSERT INTO learning_jdbc.books_authors VALUES (169, 72);
INSERT INTO learning_jdbc.books_authors VALUES (169, 77);
INSERT INTO learning_jdbc.books_authors VALUES (170, 8);
INSERT INTO learning_jdbc.books_authors VALUES (170, 45);
INSERT INTO learning_jdbc.books_authors VALUES (170, 79);
INSERT INTO learning_jdbc.books_authors VALUES (171, 2);
INSERT INTO learning_jdbc.books_authors VALUES (171, 30);
INSERT INTO learning_jdbc.books_authors VALUES (171, 48);
INSERT INTO learning_jdbc.books_authors VALUES (172, 11);
INSERT INTO learning_jdbc.books_authors VALUES (172, 54);
INSERT INTO learning_jdbc.books_authors VALUES (172, 58);
INSERT INTO learning_jdbc.books_authors VALUES (174, 9);
INSERT INTO learning_jdbc.books_authors VALUES (174, 46);
INSERT INTO learning_jdbc.books_authors VALUES (174, 65);
INSERT INTO learning_jdbc.books_authors VALUES (175, 11);
INSERT INTO learning_jdbc.books_authors VALUES (175, 22);
INSERT INTO learning_jdbc.books_authors VALUES (175, 41);
INSERT INTO learning_jdbc.books_authors VALUES (175, 65);
INSERT INTO learning_jdbc.books_authors VALUES (175, 67);
INSERT INTO learning_jdbc.books_authors VALUES (176, 36);
INSERT INTO learning_jdbc.books_authors VALUES (176, 45);
INSERT INTO learning_jdbc.books_authors VALUES (176, 58);
INSERT INTO learning_jdbc.books_authors VALUES (177, 34);
INSERT INTO learning_jdbc.books_authors VALUES (177, 69);
INSERT INTO learning_jdbc.books_authors VALUES (178, 13);
INSERT INTO learning_jdbc.books_authors VALUES (178, 16);
INSERT INTO learning_jdbc.books_authors VALUES (178, 39);
INSERT INTO learning_jdbc.books_authors VALUES (178, 81);
INSERT INTO learning_jdbc.books_authors VALUES (179, 30);
INSERT INTO learning_jdbc.books_authors VALUES (179, 46);
INSERT INTO learning_jdbc.books_authors VALUES (179, 76);
INSERT INTO learning_jdbc.books_authors VALUES (179, 78);
INSERT INTO learning_jdbc.books_authors VALUES (180, 15);
INSERT INTO learning_jdbc.books_authors VALUES (180, 16);
INSERT INTO learning_jdbc.books_authors VALUES (180, 44);
INSERT INTO learning_jdbc.books_authors VALUES (181, 3);
INSERT INTO learning_jdbc.books_authors VALUES (181, 5);
INSERT INTO learning_jdbc.books_authors VALUES (181, 57);
INSERT INTO learning_jdbc.books_authors VALUES (181, 63);
INSERT INTO learning_jdbc.books_authors VALUES (181, 75);
INSERT INTO learning_jdbc.books_authors VALUES (183, 50);
INSERT INTO learning_jdbc.books_authors VALUES (183, 64);
INSERT INTO learning_jdbc.books_authors VALUES (183, 69);
INSERT INTO learning_jdbc.books_authors VALUES (185, 16);
INSERT INTO learning_jdbc.books_authors VALUES (185, 41);
INSERT INTO learning_jdbc.books_authors VALUES (185, 51);
INSERT INTO learning_jdbc.books_authors VALUES (185, 75);
INSERT INTO learning_jdbc.books_authors VALUES (185, 77);
INSERT INTO learning_jdbc.books_authors VALUES (185, 79);
INSERT INTO learning_jdbc.books_authors VALUES (186, 10);
INSERT INTO learning_jdbc.books_authors VALUES (186, 44);
INSERT INTO learning_jdbc.books_authors VALUES (187, 4);
INSERT INTO learning_jdbc.books_authors VALUES (187, 33);
INSERT INTO learning_jdbc.books_authors VALUES (187, 44);
INSERT INTO learning_jdbc.books_authors VALUES (189, 14);
INSERT INTO learning_jdbc.books_authors VALUES (189, 24);
INSERT INTO learning_jdbc.books_authors VALUES (189, 43);
INSERT INTO learning_jdbc.books_authors VALUES (189, 59);
INSERT INTO learning_jdbc.books_authors VALUES (190, 77);
INSERT INTO learning_jdbc.books_authors VALUES (191, 27);
INSERT INTO learning_jdbc.books_authors VALUES (192, 6);
INSERT INTO learning_jdbc.books_authors VALUES (192, 12);
INSERT INTO learning_jdbc.books_authors VALUES (192, 34);
INSERT INTO learning_jdbc.books_authors VALUES (193, 10);
INSERT INTO learning_jdbc.books_authors VALUES (193, 14);
INSERT INTO learning_jdbc.books_authors VALUES (193, 54);
INSERT INTO learning_jdbc.books_authors VALUES (193, 65);
INSERT INTO learning_jdbc.books_authors VALUES (193, 75);
INSERT INTO learning_jdbc.books_authors VALUES (193, 79);
INSERT INTO learning_jdbc.books_authors VALUES (194, 74);
INSERT INTO learning_jdbc.books_authors VALUES (194, 77);
INSERT INTO learning_jdbc.books_authors VALUES (196, 6);
INSERT INTO learning_jdbc.books_authors VALUES (196, 46);
INSERT INTO learning_jdbc.books_authors VALUES (197, 27);
INSERT INTO learning_jdbc.books_authors VALUES (197, 28);
INSERT INTO learning_jdbc.books_authors VALUES (197, 42);
INSERT INTO learning_jdbc.books_authors VALUES (197, 53);
INSERT INTO learning_jdbc.books_authors VALUES (197, 71);
INSERT INTO learning_jdbc.books_authors VALUES (198, 18);
INSERT INTO learning_jdbc.books_authors VALUES (198, 66);
INSERT INTO learning_jdbc.books_authors VALUES (200, 18);
INSERT INTO learning_jdbc.books_authors VALUES (200, 28);
INSERT INTO learning_jdbc.books_authors VALUES (200, 41);
INSERT INTO learning_jdbc.books_authors VALUES (200, 65);
INSERT INTO learning_jdbc.books_authors VALUES (201, 12);
INSERT INTO learning_jdbc.books_authors VALUES (201, 31);
INSERT INTO learning_jdbc.books_authors VALUES (201, 38);
INSERT INTO learning_jdbc.books_authors VALUES (201, 55);
INSERT INTO learning_jdbc.books_authors VALUES (201, 70);
INSERT INTO learning_jdbc.books_authors VALUES (202, 6);
INSERT INTO learning_jdbc.books_authors VALUES (202, 17);
INSERT INTO learning_jdbc.books_authors VALUES (202, 38);
INSERT INTO learning_jdbc.books_authors VALUES (202, 48);
INSERT INTO learning_jdbc.books_authors VALUES (202, 49);
INSERT INTO learning_jdbc.books_authors VALUES (202, 56);
INSERT INTO learning_jdbc.books_authors VALUES (202, 60);
INSERT INTO learning_jdbc.books_authors VALUES (202, 80);
INSERT INTO learning_jdbc.books_authors VALUES (203, 35);
INSERT INTO learning_jdbc.books_authors VALUES (204, 57);
INSERT INTO learning_jdbc.books_authors VALUES (205, 25);
INSERT INTO learning_jdbc.books_authors VALUES (205, 54);
INSERT INTO learning_jdbc.books_authors VALUES (206, 3);
INSERT INTO learning_jdbc.books_authors VALUES (206, 19);
INSERT INTO learning_jdbc.books_authors VALUES (206, 46);
INSERT INTO learning_jdbc.books_authors VALUES (206, 50);
INSERT INTO learning_jdbc.books_authors VALUES (206, 60);
INSERT INTO learning_jdbc.books_authors VALUES (207, 35);
INSERT INTO learning_jdbc.books_authors VALUES (207, 40);
INSERT INTO learning_jdbc.books_authors VALUES (207, 52);
INSERT INTO learning_jdbc.books_authors VALUES (207, 59);
INSERT INTO learning_jdbc.books_authors VALUES (208, 33);
INSERT INTO learning_jdbc.books_authors VALUES (208, 52);
INSERT INTO learning_jdbc.books_authors VALUES (208, 79);
INSERT INTO learning_jdbc.books_authors VALUES (209, 14);
INSERT INTO learning_jdbc.books_authors VALUES (209, 41);
INSERT INTO learning_jdbc.books_authors VALUES (210, 34);
INSERT INTO learning_jdbc.books_authors VALUES (210, 39);
INSERT INTO learning_jdbc.books_authors VALUES (210, 72);
INSERT INTO learning_jdbc.books_authors VALUES (211, 19);
INSERT INTO learning_jdbc.books_authors VALUES (211, 75);
INSERT INTO learning_jdbc.books_authors VALUES (212, 19);
INSERT INTO learning_jdbc.books_authors VALUES (212, 23);
INSERT INTO learning_jdbc.books_authors VALUES (212, 34);
INSERT INTO learning_jdbc.books_authors VALUES (212, 68);
INSERT INTO learning_jdbc.books_authors VALUES (213, 37);
INSERT INTO learning_jdbc.books_authors VALUES (213, 73);
INSERT INTO learning_jdbc.books_authors VALUES (214, 29);
INSERT INTO learning_jdbc.books_authors VALUES (215, 11);
INSERT INTO learning_jdbc.books_authors VALUES (215, 12);
INSERT INTO learning_jdbc.books_authors VALUES (215, 17);
INSERT INTO learning_jdbc.books_authors VALUES (215, 20);
INSERT INTO learning_jdbc.books_authors VALUES (215, 27);
INSERT INTO learning_jdbc.books_authors VALUES (215, 46);
INSERT INTO learning_jdbc.books_authors VALUES (215, 71);
INSERT INTO learning_jdbc.books_authors VALUES (217, 10);
INSERT INTO learning_jdbc.books_authors VALUES (217, 24);
INSERT INTO learning_jdbc.books_authors VALUES (217, 33);
INSERT INTO learning_jdbc.books_authors VALUES (218, 9);
INSERT INTO learning_jdbc.books_authors VALUES (218, 17);
INSERT INTO learning_jdbc.books_authors VALUES (218, 34);
INSERT INTO learning_jdbc.books_authors VALUES (219, 4);
INSERT INTO learning_jdbc.books_authors VALUES (219, 28);
INSERT INTO learning_jdbc.books_authors VALUES (219, 39);
INSERT INTO learning_jdbc.books_authors VALUES (220, 28);
INSERT INTO learning_jdbc.books_authors VALUES (220, 66);
INSERT INTO learning_jdbc.books_authors VALUES (221, 3);
INSERT INTO learning_jdbc.books_authors VALUES (221, 14);
INSERT INTO learning_jdbc.books_authors VALUES (221, 23);
INSERT INTO learning_jdbc.books_authors VALUES (221, 58);
INSERT INTO learning_jdbc.books_authors VALUES (222, 4);
INSERT INTO learning_jdbc.books_authors VALUES (222, 49);
INSERT INTO learning_jdbc.books_authors VALUES (223, 38);
INSERT INTO learning_jdbc.books_authors VALUES (223, 50);
INSERT INTO learning_jdbc.books_authors VALUES (224, 33);
INSERT INTO learning_jdbc.books_authors VALUES (226, 29);
INSERT INTO learning_jdbc.books_authors VALUES (226, 36);
INSERT INTO learning_jdbc.books_authors VALUES (227, 17);
INSERT INTO learning_jdbc.books_authors VALUES (227, 29);
INSERT INTO learning_jdbc.books_authors VALUES (227, 50);
INSERT INTO learning_jdbc.books_authors VALUES (228, 3);
INSERT INTO learning_jdbc.books_authors VALUES (228, 26);
INSERT INTO learning_jdbc.books_authors VALUES (228, 70);
INSERT INTO learning_jdbc.books_authors VALUES (228, 73);
INSERT INTO learning_jdbc.books_authors VALUES (229, 55);
INSERT INTO learning_jdbc.books_authors VALUES (229, 61);
INSERT INTO learning_jdbc.books_authors VALUES (229, 67);
INSERT INTO learning_jdbc.books_authors VALUES (230, 10);
INSERT INTO learning_jdbc.books_authors VALUES (230, 18);
INSERT INTO learning_jdbc.books_authors VALUES (230, 26);
INSERT INTO learning_jdbc.books_authors VALUES (230, 49);
INSERT INTO learning_jdbc.books_authors VALUES (230, 58);
INSERT INTO learning_jdbc.books_authors VALUES (230, 70);
INSERT INTO learning_jdbc.books_authors VALUES (231, 16);
INSERT INTO learning_jdbc.books_authors VALUES (231, 30);
INSERT INTO learning_jdbc.books_authors VALUES (231, 42);
INSERT INTO learning_jdbc.books_authors VALUES (231, 46);
INSERT INTO learning_jdbc.books_authors VALUES (232, 9);
INSERT INTO learning_jdbc.books_authors VALUES (232, 24);
INSERT INTO learning_jdbc.books_authors VALUES (232, 51);
INSERT INTO learning_jdbc.books_authors VALUES (232, 79);
INSERT INTO learning_jdbc.books_authors VALUES (233, 74);
INSERT INTO learning_jdbc.books_authors VALUES (233, 75);
INSERT INTO learning_jdbc.books_authors VALUES (234, 55);
INSERT INTO learning_jdbc.books_authors VALUES (234, 70);
INSERT INTO learning_jdbc.books_authors VALUES (235, 36);
INSERT INTO learning_jdbc.books_authors VALUES (235, 49);
INSERT INTO learning_jdbc.books_authors VALUES (235, 50);
INSERT INTO learning_jdbc.books_authors VALUES (236, 14);
INSERT INTO learning_jdbc.books_authors VALUES (236, 73);
INSERT INTO learning_jdbc.books_authors VALUES (237, 72);
INSERT INTO learning_jdbc.books_authors VALUES (237, 80);
INSERT INTO learning_jdbc.books_authors VALUES (238, 2);
INSERT INTO learning_jdbc.books_authors VALUES (238, 23);
INSERT INTO learning_jdbc.books_authors VALUES (238, 81);
INSERT INTO learning_jdbc.books_authors VALUES (239, 16);
INSERT INTO learning_jdbc.books_authors VALUES (239, 34);
INSERT INTO learning_jdbc.books_authors VALUES (239, 38);
INSERT INTO learning_jdbc.books_authors VALUES (239, 42);
INSERT INTO learning_jdbc.books_authors VALUES (239, 67);
INSERT INTO learning_jdbc.books_authors VALUES (240, 15);
INSERT INTO learning_jdbc.books_authors VALUES (240, 23);
INSERT INTO learning_jdbc.books_authors VALUES (240, 41);
INSERT INTO learning_jdbc.books_authors VALUES (241, 52);
INSERT INTO learning_jdbc.books_authors VALUES (241, 70);
INSERT INTO learning_jdbc.books_authors VALUES (242, 20);
INSERT INTO learning_jdbc.books_authors VALUES (242, 58);
INSERT INTO learning_jdbc.books_authors VALUES (243, 19);
INSERT INTO learning_jdbc.books_authors VALUES (243, 37);
INSERT INTO learning_jdbc.books_authors VALUES (243, 41);
INSERT INTO learning_jdbc.books_authors VALUES (243, 43);
INSERT INTO learning_jdbc.books_authors VALUES (243, 62);
INSERT INTO learning_jdbc.books_authors VALUES (244, 47);
INSERT INTO learning_jdbc.books_authors VALUES (244, 52);
INSERT INTO learning_jdbc.books_authors VALUES (244, 54);
INSERT INTO learning_jdbc.books_authors VALUES (245, 48);
INSERT INTO learning_jdbc.books_authors VALUES (245, 56);
INSERT INTO learning_jdbc.books_authors VALUES (246, 1);
INSERT INTO learning_jdbc.books_authors VALUES (246, 29);
INSERT INTO learning_jdbc.books_authors VALUES (246, 68);
INSERT INTO learning_jdbc.books_authors VALUES (247, 63);
INSERT INTO learning_jdbc.books_authors VALUES (248, 6);
INSERT INTO learning_jdbc.books_authors VALUES (248, 20);
INSERT INTO learning_jdbc.books_authors VALUES (248, 52);
INSERT INTO learning_jdbc.books_authors VALUES (249, 11);
INSERT INTO learning_jdbc.books_authors VALUES (249, 29);
INSERT INTO learning_jdbc.books_authors VALUES (249, 42);
INSERT INTO learning_jdbc.books_authors VALUES (249, 60);
INSERT INTO learning_jdbc.books_authors VALUES (249, 65);
INSERT INTO learning_jdbc.books_authors VALUES (249, 67);
INSERT INTO learning_jdbc.books_authors VALUES (250, 5);
INSERT INTO learning_jdbc.books_authors VALUES (250, 19);
INSERT INTO learning_jdbc.books_authors VALUES (250, 48);
INSERT INTO learning_jdbc.books_authors VALUES (250, 56);
INSERT INTO learning_jdbc.books_authors VALUES (199, 53);
INSERT INTO learning_jdbc.books_authors VALUES (199, 128);
INSERT INTO learning_jdbc.books_authors VALUES (216, 29);
INSERT INTO learning_jdbc.books_authors VALUES (216, 56);
INSERT INTO learning_jdbc.books_authors VALUES (216, 68);
INSERT INTO learning_jdbc.books_authors VALUES (216, 128);
INSERT INTO learning_jdbc.books_authors VALUES (225, 56);
INSERT INTO learning_jdbc.books_authors VALUES (225, 128);
INSERT INTO learning_jdbc.books_authors VALUES (1, 71);
INSERT INTO learning_jdbc.books_authors VALUES (1, 74);
INSERT INTO learning_jdbc.books_authors VALUES (1, 81);
INSERT INTO learning_jdbc.books_authors VALUES (1, 129);


--
-- TOC entry 3129 (class 0 OID 16839)
-- Dependencies: 211
-- Data for Name: country_of_born; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.country_of_born VALUES (1, 'China', 1394470000);
INSERT INTO learning_jdbc.country_of_born VALUES (2, 'Ukraine', 97530090);
INSERT INTO learning_jdbc.country_of_born VALUES (3, 'Uganda', 67668147);
INSERT INTO learning_jdbc.country_of_born VALUES (4, 'Venezuela', 17308792);
INSERT INTO learning_jdbc.country_of_born VALUES (5, 'Iran', 17685247);
INSERT INTO learning_jdbc.country_of_born VALUES (6, 'Kazakhstan', 149087017);
INSERT INTO learning_jdbc.country_of_born VALUES (7, 'Brazil', 43634634);
INSERT INTO learning_jdbc.country_of_born VALUES (8, 'Poland', 91523636);
INSERT INTO learning_jdbc.country_of_born VALUES (9, 'Indonesia', 124838255);
INSERT INTO learning_jdbc.country_of_born VALUES (11, 'Czech Republic', 30396633);
INSERT INTO learning_jdbc.country_of_born VALUES (12, 'Sweden', 122524801);
INSERT INTO learning_jdbc.country_of_born VALUES (13, 'Philippines', 56550131);
INSERT INTO learning_jdbc.country_of_born VALUES (14, 'France', 137384759);
INSERT INTO learning_jdbc.country_of_born VALUES (15, 'Russia', 146207469);
INSERT INTO learning_jdbc.country_of_born VALUES (16, 'Ethiopia', 20550248);
INSERT INTO learning_jdbc.country_of_born VALUES (17, 'Portugal', 69453411);
INSERT INTO learning_jdbc.country_of_born VALUES (18, 'Tajikistan', 102132047);
INSERT INTO learning_jdbc.country_of_born VALUES (19, 'United States', 78104462);
INSERT INTO learning_jdbc.country_of_born VALUES (20, 'Angola', 87434294);
INSERT INTO learning_jdbc.country_of_born VALUES (21, 'Bosnia and Herzegovina', 130127262);
INSERT INTO learning_jdbc.country_of_born VALUES (22, 'Egypt', 83370395);
INSERT INTO learning_jdbc.country_of_born VALUES (23, 'Syria', 94526125);
INSERT INTO learning_jdbc.country_of_born VALUES (24, 'Saudi Arabia', 25098164);
INSERT INTO learning_jdbc.country_of_born VALUES (25, 'Malaysia', 1673315);
INSERT INTO learning_jdbc.country_of_born VALUES (26, 'Thailand', 98854000);
INSERT INTO learning_jdbc.country_of_born VALUES (27, 'Mongolia', 78535120);
INSERT INTO learning_jdbc.country_of_born VALUES (28, 'Morocco', 69227176);
INSERT INTO learning_jdbc.country_of_born VALUES (29, 'Cuba', 92984381);
INSERT INTO learning_jdbc.country_of_born VALUES (30, 'South Korea', 5425346);
INSERT INTO learning_jdbc.country_of_born VALUES (31, 'Nicaragua', 22916288);
INSERT INTO learning_jdbc.country_of_born VALUES (32, 'Denmark', 50364321);
INSERT INTO learning_jdbc.country_of_born VALUES (33, 'Argentina', 17224782);
INSERT INTO learning_jdbc.country_of_born VALUES (34, 'Mauritania', 25101404);
INSERT INTO learning_jdbc.country_of_born VALUES (35, 'Ivory Coast', 91756605);
INSERT INTO learning_jdbc.country_of_born VALUES (36, 'Jamaica', 84690482);
INSERT INTO learning_jdbc.country_of_born VALUES (37, 'Slovenia', 71176347);
INSERT INTO learning_jdbc.country_of_born VALUES (38, 'Benin', 19048974);
INSERT INTO learning_jdbc.country_of_born VALUES (39, 'Colombia', 29436254);


--
-- TOC entry 3131 (class 0 OID 16844)
-- Dependencies: 213
-- Data for Name: persons; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.persons VALUES (4, 'megabrain', '$2a$05$hXr8rQb6TUhm49Cwncf/6OeCtR7W6wW/FQEmnTnUpTrsXIby8VNnO', 'Albert', 'Einstain', '1879-03-14', 3500.00);
INSERT INTO learning_jdbc.persons VALUES (5, 'стасямба', '$2a$05$UNL9A1RftCTFV6LTD3xn7O8i1n3hJBliZS3ZcY/JRnqkFzqP7A8iu', 'Станистав', 'Кину Где Попало', '1986-09-14', 500.00);
INSERT INTO learning_jdbc.persons VALUES (10, 'Siarhei', '$2a$05$jyGrPd26X0oSUwAkS0Oc4upM/FG39jGpukcbqZYW4HjNH9L/ciMsy', 'Siarhei', 'Melez', '1965-07-02', 320.00);
INSERT INTO learning_jdbc.persons VALUES (11, 'sequoya', '$2a$05$KWnIcxKVHOrCTscNRCwSaukfgJW0w5ghbKV08ixXs3W5vfjTRQuOC', 'Sequoya', 'The Three', '0001-01-01', 50000.00);
INSERT INTO learning_jdbc.persons VALUES (12, 'astronaut', '$2a$05$PSQldTmCUzgTjmggL5l0t.iadQMLoT1DLW2Ut1GCvSXMFj/zN9Gdu', 'Astronaut', 'A5 Naebali', '2019-05-15', 1.00);
INSERT INTO learning_jdbc.persons VALUES (13, 'juno', '$2a$05$Y1JgFJ0GtpYVywIiVJe4TuVMXX8EbbnMPw20Fv6O8BpAl.LGlald.', 'Lely', 'Juno', '2010-03-15', 357.00);
INSERT INTO learning_jdbc.persons VALUES (18, 'Hash', '$2a$05$KrCR5qqxntc.JO/kqAAbt.ejGbQ2pdLUpstDubqjz3SM/WMT5W9de', 'Hash', 'User', '1965-02-21', 0.00);
INSERT INTO learning_jdbc.persons VALUES (19, 'test', '$2a$05$FwOH5H2OLR.qENy9YvW6p.MnIUSvvY1ZT8XL.l4wCIj6JrBHZlWG.', 'TeSt', 'tEsT', '1985-06-19', 0.00);


--
-- TOC entry 3133 (class 0 OID 16852)
-- Dependencies: 215
-- Data for Name: products; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.products VALUES (25, 'молоко', 1.25, 4);
INSERT INTO learning_jdbc.products VALUES (27, 'молоко', 1.25, 4);
INSERT INTO learning_jdbc.products VALUES (28, 'Milk', 1.15, 4);
INSERT INTO learning_jdbc.products VALUES (29, 'Milk', 1.15, 4);
INSERT INTO learning_jdbc.products VALUES (30, 'КАРТОШКА', 1.15, 5);
INSERT INTO learning_jdbc.products VALUES (31, 'PC', 1530.00, 13);
INSERT INTO learning_jdbc.products VALUES (32, 'Iphone', 43.00, 13);
INSERT INTO learning_jdbc.products VALUES (33, 'Soup', 7.50, 13);
INSERT INTO learning_jdbc.products VALUES (34, 'LapTop', 789.00, 13);
INSERT INTO learning_jdbc.products VALUES (35, 'Bread', 5.00, 13);
INSERT INTO learning_jdbc.products VALUES (36, 'Lamp', 3.20, 13);
INSERT INTO learning_jdbc.products VALUES (37, 'TV', 769.00, 13);
INSERT INTO learning_jdbc.products VALUES (38, 'VHC Tape', 1.00, 13);
INSERT INTO learning_jdbc.products VALUES (39, 'Cd', 32.00, 13);
INSERT INTO learning_jdbc.products VALUES (40, 'mleco', 5.00, 13);
INSERT INTO learning_jdbc.products VALUES (41, 'Тетрадь', 1.20, 13);


--
-- TOC entry 3135 (class 0 OID 16857)
-- Dependencies: 217
-- Data for Name: year_of_publishing; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

INSERT INTO learning_jdbc.year_of_publishing VALUES (35, '1917-08-07');
INSERT INTO learning_jdbc.year_of_publishing VALUES (24, '1917-12-03');
INSERT INTO learning_jdbc.year_of_publishing VALUES (27, '1919-03-18');
INSERT INTO learning_jdbc.year_of_publishing VALUES (23, '1921-04-12');
INSERT INTO learning_jdbc.year_of_publishing VALUES (12, '1922-11-19');
INSERT INTO learning_jdbc.year_of_publishing VALUES (7, '1924-09-01');
INSERT INTO learning_jdbc.year_of_publishing VALUES (13, '1930-01-07');
INSERT INTO learning_jdbc.year_of_publishing VALUES (16, '1931-11-27');
INSERT INTO learning_jdbc.year_of_publishing VALUES (9, '1932-10-07');
INSERT INTO learning_jdbc.year_of_publishing VALUES (39, '1935-02-02');
INSERT INTO learning_jdbc.year_of_publishing VALUES (38, '1944-10-17');
INSERT INTO learning_jdbc.year_of_publishing VALUES (18, '1947-02-05');
INSERT INTO learning_jdbc.year_of_publishing VALUES (1, '1947-02-22');
INSERT INTO learning_jdbc.year_of_publishing VALUES (31, '1949-07-30');
INSERT INTO learning_jdbc.year_of_publishing VALUES (10, '1950-03-16');
INSERT INTO learning_jdbc.year_of_publishing VALUES (30, '1950-06-22');
INSERT INTO learning_jdbc.year_of_publishing VALUES (36, '1950-09-06');
INSERT INTO learning_jdbc.year_of_publishing VALUES (32, '1960-10-29');
INSERT INTO learning_jdbc.year_of_publishing VALUES (3, '1964-11-13');
INSERT INTO learning_jdbc.year_of_publishing VALUES (37, '1966-07-27');
INSERT INTO learning_jdbc.year_of_publishing VALUES (11, '1967-09-08');
INSERT INTO learning_jdbc.year_of_publishing VALUES (19, '1971-10-03');
INSERT INTO learning_jdbc.year_of_publishing VALUES (26, '1974-08-31');
INSERT INTO learning_jdbc.year_of_publishing VALUES (4, '1975-04-25');
INSERT INTO learning_jdbc.year_of_publishing VALUES (34, '1979-01-01');
INSERT INTO learning_jdbc.year_of_publishing VALUES (6, '1984-11-05');
INSERT INTO learning_jdbc.year_of_publishing VALUES (40, '1986-02-07');
INSERT INTO learning_jdbc.year_of_publishing VALUES (21, '1986-03-15');
INSERT INTO learning_jdbc.year_of_publishing VALUES (29, '1989-07-03');
INSERT INTO learning_jdbc.year_of_publishing VALUES (28, '1994-11-26');
INSERT INTO learning_jdbc.year_of_publishing VALUES (17, '1995-08-07');
INSERT INTO learning_jdbc.year_of_publishing VALUES (20, '1995-08-16');
INSERT INTO learning_jdbc.year_of_publishing VALUES (5, '1997-06-11');
INSERT INTO learning_jdbc.year_of_publishing VALUES (41, '1998-07-26');
INSERT INTO learning_jdbc.year_of_publishing VALUES (22, '1999-01-06');
INSERT INTO learning_jdbc.year_of_publishing VALUES (8, '2007-09-05');
INSERT INTO learning_jdbc.year_of_publishing VALUES (15, '2009-06-28');
INSERT INTO learning_jdbc.year_of_publishing VALUES (14, '2013-08-17');
INSERT INTO learning_jdbc.year_of_publishing VALUES (33, '2014-08-05');
INSERT INTO learning_jdbc.year_of_publishing VALUES (2, '2017-12-08');
INSERT INTO learning_jdbc.year_of_publishing VALUES (25, '2017-12-14');


--
-- TOC entry 3137 (class 0 OID 16862)
-- Dependencies: 219
-- Data for Name: periodicals; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

INSERT INTO mywebprojectdb.periodicals VALUES (1, '0190-8286', 'NEWSPAPPER', 'The Washington Post', 'The Washington Post (sometimes abbreviated as WaPo) is a major American daily newspaper published in Washington, D.C., with a particular emphasis on national politics and the federal government. It has the largest circulation in the Washington metropolitan area. Its slogan \"Democracy Dies in Darkness\" began appearing on its masthead in 2017. Daily broadsheet editions are printed for the District of Columbia, Maryland, and Virginia.', 365, 0.35, true);
INSERT INTO mywebprojectdb.periodicals VALUES (2, '0362-4331', 'NEWSPAPPER', 'The New York Times', 'The New York Times (shortened as The Times and abbreviated as The NYT) is an American newspaper based in New York City with worldwide influence and readership.Founded in 1851, the paper has won 125 Pulitzer Prizes, more than any other newspaper. The Times is ranked 17th in the world by circulation and 2nd in the U.S. ', 365, 0.50, true);
INSERT INTO mywebprojectdb.periodicals VALUES (3, '1992-3058', 'UNDEFINED', 'СБ. Беларусь сегодня', 'Белорусская общественно-политическая газета. Издаётся с августа 1927 года. Выходит 5 раз в неделю. Учредители — Администрация президента Республики Беларусь и редакционный совет. На декабрь 2013 года тираж — 400 614 экземпляров. Крупнейшее печатное СМИ страны. В последние годы выходит под брендом ≪СБ. Беларусь сегодня≫. ', 270, 0.37, true);
INSERT INTO mywebprojectdb.periodicals VALUES (4, '5894-4521', 'UNDEFINED', 'Marvel Adventures', 'Marvel Adventures, formerly Marvel Age, was an imprint of Marvel Comics intended for younger audiences, including small children. Unlike the standard comics published by Marvel, which often take place in story arcs spanning several issues, each Marvel Adventures comic tells a standalone story. In April 2012 it was replaced by all new All Ages line tied to the Marvel Universe block on Disney XD.', 12, 17.00, true);
INSERT INTO mywebprojectdb.periodicals VALUES (5, '3256-4521', 'UNDEFINED', 'Batman', 'Batman is an ongoing American comic book series featuring the DC Comics superhero Batman as its main protagonist. The character first appeared in Detective Comics #27 (cover dated May 1939). Batman proved to be so popular that a self-titled ongoing comic book series began publication with a cover date of Spring 1940. It was first advertised in early April 1940, one month after the first appearance of his new sidekick, Robin, the Boy Wonder. ', 54, 20.50, true);
INSERT INTO mywebprojectdb.periodicals VALUES (6, '3697-5428', 'UNDEFINED', 'Наша нива', 'Начала выходить в Вильне с 10 (23) ноября 1906 по 7 августа 1915 на белорусском языке кириллицей и с первого номера до № 42, 18 (31) октября 1912) также белорусской латиницей, с заглавиями «Наша Ніва» и «Nasza Niwa».  Редакторы-издатели З. Вольский, А. Власов, И. Луцкевич. Печаталась в типографии Мартина Кухты. ', 12, 0.79, true);
INSERT INTO mywebprojectdb.periodicals VALUES (7, '3587-8542', 'UNDEFINED', 'Marvel', 'Spider-Man', 54, 2.50, false);
INSERT INTO mywebprojectdb.periodicals VALUES (8, '1234-4321', 'UNDEFINED', 'Enter title', 'Enter description', 0, 0.00, false);
INSERT INTO mywebprojectdb.periodicals VALUES (9, '1234-4321', 'NEWSPAPPER', 'Перспектива', 'Перспективы нЭт', 500, 15.00, false);
INSERT INTO mywebprojectdb.periodicals VALUES (10, '1234-4321', 'NEWSPAPPER', 'Советская белорусия', 'Как хорошо живется у нас в стране', 365, 100.00, false);
INSERT INTO mywebprojectdb.periodicals VALUES (11, '1145-8545', 'UNDEFINED', 'ТЕперь мы periodicals', 'Enter descriptionon', 15, 20.00, false);
INSERT INTO mywebprojectdb.periodicals VALUES (12, '1234-4321', 'UNDEFINED', 'djdghk', 'Enter descriptiodghkfghjdfn', 0, 0.00, false);
INSERT INTO mywebprojectdb.periodicals VALUES (13, '5569-', 'UNDEFINED', 'Enter title', 'Enter description', 0, 0.00, false);


--
-- TOC entry 3139 (class 0 OID 16873)
-- Dependencies: 221
-- Data for Name: periodicals_types; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

INSERT INTO mywebprojectdb.periodicals_types VALUES ('COMIC', true);
INSERT INTO mywebprojectdb.periodicals_types VALUES ('NEWSPAPPER', true);
INSERT INTO mywebprojectdb.periodicals_types VALUES ('SCIENCE_MAGAZINE', true);
INSERT INTO mywebprojectdb.periodicals_types VALUES ('UNDEFINED', true);


--
-- TOC entry 3140 (class 0 OID 16877)
-- Dependencies: 222
-- Data for Name: subscribes; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

INSERT INTO mywebprojectdb.subscribes VALUES (11, 2, 4, 17.00, 0.00, 1, '2018-12-20', '2019-01-20', false, true);
INSERT INTO mywebprojectdb.subscribes VALUES (12, 2, 5, 1107.00, 0.00, 12, '2018-12-20', '2019-12-20', false, true);


--
-- TOC entry 3142 (class 0 OID 16887)
-- Dependencies: 224
-- Data for Name: users; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

INSERT INTO mywebprojectdb.users VALUES (1, 'admin', 'admin', 'ADMIN', 'Admin', 'Adminovich', 'admin@admin.com', '+375295556666', '230025, Grodno, Kirova str., 1 ', 100.00, true);
INSERT INTO mywebprojectdb.users VALUES (2, 'nikola', 'tesla', 'CUSTOMER', 'Nikola', 'Tesla', 'nikolatesla@tut.by', '+12123633200', '10004, New York city', 1000.00, true);
INSERT INTO mywebprojectdb.users VALUES (6, 'testuser', '12345678', 'CUSTOMER', 'Вася', 'Пупкин', 'vasilij.pupkin@gmail.com', '+375296666666', '230026 Grodno, Kleckova 26', 0.00, true);


--
-- TOC entry 3144 (class 0 OID 16898)
-- Dependencies: 226
-- Data for Name: users_roles; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

INSERT INTO mywebprojectdb.users_roles VALUES ('ADMIN', true);
INSERT INTO mywebprojectdb.users_roles VALUES ('ANONYMOUS', false);
INSERT INTO mywebprojectdb.users_roles VALUES ('CUSTOMER', true);


--
-- TOC entry 3156 (class 0 OID 17089)
-- Dependencies: 238
-- Data for Name: all_info; Type: TABLE DATA; Schema: temp_customer_info; Owner: s_moiseenko
--

INSERT INTO temp_customer_info.all_info VALUES (21, 'SPK Agrokombinat Snov', true, '0730000020', 10, '', true, 'SNV', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17118');
INSERT INTO temp_customer_info.all_info VALUES (2, 'PKUP Sovhoz Smorgonskiy', true, '0730000002', 4, 'ПКУП "Совхоз Сморгонский"', false, 'SMR', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.10.0.6', '', '', '', '', 'Windows Server 2008 Standard', '17099');
INSERT INTO temp_customer_info.all_info VALUES (22, 'U.O. Belorusskaya Gosudarstvennaya', false, '0730000021', 1, '', false, 'GRK', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.15', '', '', '', '', 'Windows 7 Professional', '17119');
INSERT INTO temp_customer_info.all_info VALUES (5, 'UP Vitebskoblgaz', true, '0730000005', 12, 'СХП "Мазоловогаз", А3Next ', true, 'MZL-A3NEXT', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17102');
INSERT INTO temp_customer_info.all_info VALUES (13, 'UP Vitebskoblgaz', true, '0730000005', 4, 'СХП "Мазоловогаз", А4', true, 'MZL-A4', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Professional', '17110');
INSERT INTO temp_customer_info.all_info VALUES (24, 'UP Agrokombinat Zhdanovichi', true, '0730000024', 11, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17121');
INSERT INTO temp_customer_info.all_info VALUES (18, 'OAO Alexanderijskoe', false, '0730000017', 16, 'ОАО "Александрийское"', true, 'AXR', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2012 R2 Standard', '25363');
INSERT INTO temp_customer_info.all_info VALUES (25, 'OOO Tarasovo', false, '0730000025', 6, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows Server 2008 R2 Standard', '17122');
INSERT INTO temp_customer_info.all_info VALUES (26, 'ZAO "1 Maja"', false, '0730000026', 3, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.15', '', '', '', '', 'Windows 7 Professional', '17123');
INSERT INTO temp_customer_info.all_info VALUES (9, 'SPK Gorodeya', false, '0730000011', 4, 'ОАО "Городея", A3Next', true, 'GRD-A3NEXT', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 10 Pro', '17106');
INSERT INTO temp_customer_info.all_info VALUES (7, 'SPK Progress-Vertelishki', true, '0730000009', 16, 'СПК "Прогресс-Вертелишки"', true, 'PRG', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '25359');
INSERT INTO temp_customer_info.all_info VALUES (12, 'OAO Turovschina', false, '0730000014', 6, 'ОАО "Туровщина", МТФ "Новая Казаргать"', false, 'TRV', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows Server 2008 R2 Standard', '25356');
INSERT INTO temp_customer_info.all_info VALUES (16, 'RUP Minskenergo fil. Lebedevo', true, '0730000015', 12, 'РУП "Минскэнерго" (филиал Агрофирма "Лебедево" РУП "Минскэнерго")', true, 'LBD', 'Microsoft SQL Server 2017', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2019 Standard', '25357');
INSERT INTO temp_customer_info.all_info VALUES (10, 'SHP Vydreya', false, '0730000012', 6, 'УП Витебское отделение белорусской железной дороги СХП Выдрея МТФ "Чиковщина"', false, 'VDR', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows Server 2008 R2 Standard', '25354');
INSERT INTO temp_customer_info.all_info VALUES (14, 'Jsc Lepelskij molochnokons. kombinat', false, '0730000006', 6, 'ОАО "Лепельский молочноконсервный комбинат", A4, Старый Лепель', true, 'LPL-A4', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.7.19', '', '', '', '', 'Windows Server 2008 R2 Standard', '17111');
INSERT INTO temp_customer_info.all_info VALUES (6, 'Jsc Lepelskij molochnokons. kombinat', true, '0730000006', 12, 'ОАО "Лепельский молочноконсервный комбинат", A3Next, Юрковщина', true, 'LPL-A3NEXT', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2016 Standard', '17103');
INSERT INTO temp_customer_info.all_info VALUES (15, 'SPK Gorodeya', false, '0730000011', 4, 'ОАО "Грордея", A4', true, 'GRD-A4', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17112');
INSERT INTO temp_customer_info.all_info VALUES (8, 'SPK Nesvizhskie Ostrovki', true, '0730000010', 6, 'ОАО "Несвижские островки"', true, 'NVZ', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm No Maintenance', '3.5.0.11', '', '', '', '', 'Windows Server 2008 R2 Standard', '25360');
INSERT INTO temp_customer_info.all_info VALUES (28, 'OAO "Dorors"', true, '0730000028', 6, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17125');
INSERT INTO temp_customer_info.all_info VALUES (29, 'CHUP "ASB Pervaja Vesna"', false, '0730000029', 4, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.11.0.8', '', '', '', '', 'Windows 7 Professional', '17126');
INSERT INTO temp_customer_info.all_info VALUES (30, 'OAO "Kuhchitsy"', true, '0730000030', 2, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Professional', '17127');
INSERT INTO temp_customer_info.all_info VALUES (31, 'OAO "Raps"', false, '0730000031', 6, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.3.1.18', '', '', '', '', 'Windows Server 2008 R2 Standard', '17128');
INSERT INTO temp_customer_info.all_info VALUES (32, 'OAO ''Gastellovskoe"', false, '0730000032', 14, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.6.0.11', '', '', '', '', 'Windows Server 2008 R2 Standard', '17129');
INSERT INTO temp_customer_info.all_info VALUES (33, 'OAO "Krutogorje-Petkovichi"', false, '0730000033', 4, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.7.19', '', '', '', '', 'Windows 7 Professional', '17130');
INSERT INTO temp_customer_info.all_info VALUES (34, 'OAO "Octayabrskaya Revolucia"', false, '0730000034', 2, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.7.19', '', '', '', '', 'Windows 7 Professional', '17131');
INSERT INTO temp_customer_info.all_info VALUES (35, 'OAO "Kosino"', true, '0730000035', 4, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.7.19', '', '', '', '', 'Windows Server 2008 R2 Standard', '17132');
INSERT INTO temp_customer_info.all_info VALUES (37, 'GP "ZhodinoAgroPlemElita"', false, '0730000037', 1, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.3.1.21', '', '', '', '', 'Windows 7 Professional', '17134');
INSERT INTO temp_customer_info.all_info VALUES (39, 'OAO "Gritskevichi"', true, '0730000039', 6, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2012 R2 Standard', '17136');
INSERT INTO temp_customer_info.all_info VALUES (41, 'SHP "Velikopolje", KUP "Minsktrans"', false, '0730000041', 8, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.7.19', '', '', '', '', 'Windows Server 2008 R2 Standard', '17138');
INSERT INTO temp_customer_info.all_info VALUES (27, 'RUP "MTZ', false, '0730000027', 3, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.10.0.6', '', '', '', '', 'Windows 7 Professional', '25347');
INSERT INTO temp_customer_info.all_info VALUES (4, 'SPK Khotily', true, '0730000004', 12, 'ОАО "Хотилы Агро"', true, 'HTL', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '25345');
INSERT INTO temp_customer_info.all_info VALUES (38, 'OAO "Jushevichi"', true, '0730000038', 6, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '25373');
INSERT INTO temp_customer_info.all_info VALUES (40, 'SHP Voshod', true, '0730000040', 10, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.10.0.9', '', '', '', '', 'Windows Server 2008 R2 Standard', '25348');
INSERT INTO temp_customer_info.all_info VALUES (42, 'OAO "Lipovtsy"', false, '0730000042', 2, '', false, '', 'Microsoft SQL Server 2014', 'Farm', '3.6.0.11', '', '', '', '', 'Windows 7 Professional', '25349');
INSERT INTO temp_customer_info.all_info VALUES (19, 'RUP Vitebskenergo', true, '0730000018', 6, 'Филиал "Весна-энерго"РУП "Витебскэнерго"', true, 'VEN', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows Server 2008 R2 Standard', '25371');
INSERT INTO temp_customer_info.all_info VALUES (43, 'UP "Mingaz"', true, '0730000043', 10, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Professional', '25352');
INSERT INTO temp_customer_info.all_info VALUES (17, 'GPU NP Belovezhskaya Puscha', true, '0730000016', 6, 'Сельскохозяйственное унитарное предприятие "ВМК-АГРО"', true, 'DBV', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '25370');
INSERT INTO temp_customer_info.all_info VALUES (23, 'SP OOO Belita', true, '0730000023', 2, '', true, 'BTA', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 10 Pro', '33561');
INSERT INTO temp_customer_info.all_info VALUES (36, 'OAO "Vilejskij Kombikormovyj Zavod"', true, '0730000036', 2, 'ОАО "Вилейский Комбикормовый Завод"', true, 'VKZ', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '1563006208', '', '', '', 'Windows 7 Professional', '25372');
INSERT INTO temp_customer_info.all_info VALUES (45, 'OAO " Gluboskij Myaskombinat"', true, '0730000045', 2, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Ultimate', '17142');
INSERT INTO temp_customer_info.all_info VALUES (46, 'OAO "Novoselki Luchaj"', true, '0730000046', 12, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17143');
INSERT INTO temp_customer_info.all_info VALUES (47, 'OAO "Poloydkij Molochnyj Kombinat"', false, '0730000047', 2, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows 7 Professional', '17144');
INSERT INTO temp_customer_info.all_info VALUES (48, 'OAO "Reshajushij"', false, '0730000048', 4, '', false, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows 7 Professional', '17145');
INSERT INTO temp_customer_info.all_info VALUES (49, 'Minskij Molochnvy Zavod nr. 1', true, '0730000049', 7, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2012 R2 Standard', '17146');
INSERT INTO temp_customer_info.all_info VALUES (50, 'OOO "Narochanskaya Niva 2004"', true, '0730000050', 2, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Professional', '17147');
INSERT INTO temp_customer_info.all_info VALUES (51, 'OAO "Gluboskij Molochnokonservnyj Ko', false, '0730000051', 2, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.2.7.19', '', '', '', '', 'Windows 7 Professional', '17148');
INSERT INTO temp_customer_info.all_info VALUES (52, 'OAO Kletskij Kombikormovvj Zavod', true, '0730000053', 2, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 7 Ultimate', '17149');
INSERT INTO temp_customer_info.all_info VALUES (53, 'OAO "Orshanskij Miasokonservnyj Komb', true, '0730000054', 12, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2003 Standard', '17150');
INSERT INTO temp_customer_info.all_info VALUES (54, 'KSUP "Plemennoj Zavod Krasnaya Zvezd', true, '0730000055', 5, '', true, '', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '17151');
INSERT INTO temp_customer_info.all_info VALUES (55, 'CHPUP "Uzhitsa Agro"', true, '0730000056', 12, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2016 Standard', '17152');
INSERT INTO temp_customer_info.all_info VALUES (56, 'OAO "Azot-Agro"', false, '0730000058', 8, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.5.0.11', '', '', '', '', 'Windows Server 2012 R2 Standard', '17153');
INSERT INTO temp_customer_info.all_info VALUES (44, 'OAO "Kaganets"', true, '0730000044', 3, '', true, '', 'Microsoft SQL Server 2014', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 8.1 Pro', '17141');
INSERT INTO temp_customer_info.all_info VALUES (3, 'SPK Kommunar-Agro', false, '0730000003', 2, 'СПК "Коммунар-агро"', false, 'KNR', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.2.0.63', '', '', '', '', 'Windows 7 Professional', '25344');
INSERT INTO temp_customer_info.all_info VALUES (11, 'GPU NP Pripyatskij', false, '0730000013', 6, 'СХК "Лясковичи"', false, 'LSK', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.7.0.17', '', '', '', '', 'Windows Server 2003 Standard', '25361');
INSERT INTO temp_customer_info.all_info VALUES (20, 'KUP Minskaya Ovoschnaya Fabrika', true, '0730000019', 16, 'КУП "Минская овощная фабрика"', true, 'MOF', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows Server 2008 R2 Standard', '25364');
INSERT INTO temp_customer_info.all_info VALUES (1, 'Vladimir Korsun', true, '0730000000', 2, 'ОАО "Соколовщина"', true, 'SKL', 'Microsoft SQL Server 2008 R2 (SP2)', 'Farm', '3.12.8.2', '', '', '', '', 'Windows 10 Pro', '25369');


--
-- TOC entry 3198 (class 0 OID 0)
-- Dependencies: 227
-- Name: customer_id_seq; Type: SEQUENCE SET; Schema: customers_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('customers_info.customer_id_seq', 5, true);


--
-- TOC entry 3199 (class 0 OID 0)
-- Dependencies: 229
-- Name: pc_info_id_seq; Type: SEQUENCE SET; Schema: customers_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('customers_info.pc_info_id_seq', 1, false);


--
-- TOC entry 3200 (class 0 OID 0)
-- Dependencies: 231
-- Name: sql_version_id_seq; Type: SEQUENCE SET; Schema: customers_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('customers_info.sql_version_id_seq', 1, false);


--
-- TOC entry 3201 (class 0 OID 0)
-- Dependencies: 233
-- Name: t4c_server_id_seq; Type: SEQUENCE SET; Schema: customers_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('customers_info.t4c_server_id_seq', 1, false);


--
-- TOC entry 3202 (class 0 OID 0)
-- Dependencies: 235
-- Name: windows_version_id_seq; Type: SEQUENCE SET; Schema: customers_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('customers_info.windows_version_id_seq', 1, true);


--
-- TOC entry 3203 (class 0 OID 0)
-- Dependencies: 207
-- Name: authors_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.authors_id_seq', 251, true);


--
-- TOC entry 3204 (class 0 OID 0)
-- Dependencies: 210
-- Name: books_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.books_id_seq', 128, true);


--
-- TOC entry 3205 (class 0 OID 0)
-- Dependencies: 212
-- Name: country_of_born_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.country_of_born_id_seq', 39, true);


--
-- TOC entry 3206 (class 0 OID 0)
-- Dependencies: 214
-- Name: persons_person_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.persons_person_id_seq', 19, true);


--
-- TOC entry 3207 (class 0 OID 0)
-- Dependencies: 216
-- Name: products_product_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.products_product_id_seq', 41, true);


--
-- TOC entry 3208 (class 0 OID 0)
-- Dependencies: 218
-- Name: year_of_publishing_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.year_of_publishing_id_seq', 41, true);


--
-- TOC entry 3209 (class 0 OID 0)
-- Dependencies: 220
-- Name: periodicals_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.periodicals_id_seq', 13, true);


--
-- TOC entry 3210 (class 0 OID 0)
-- Dependencies: 223
-- Name: subscribes_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.subscribes_id_seq', 13, true);


--
-- TOC entry 3211 (class 0 OID 0)
-- Dependencies: 225
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.users_id_seq', 8, true);


--
-- TOC entry 3212 (class 0 OID 0)
-- Dependencies: 237
-- Name: all_info_id_seq; Type: SEQUENCE SET; Schema: temp_customer_info; Owner: s_moiseenko
--

SELECT pg_catalog.setval('temp_customer_info.all_info_id_seq', 57, true);


--
-- TOC entry 2974 (class 2606 OID 17013)
-- Name: customer customer_pkey; Type: CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (id);


--
-- TOC entry 2976 (class 2606 OID 17024)
-- Name: pc_info pc_info_pkey; Type: CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.pc_info
    ADD CONSTRAINT pc_info_pkey PRIMARY KEY (id);


--
-- TOC entry 2978 (class 2606 OID 17032)
-- Name: sql_version sql_version_pkey; Type: CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.sql_version
    ADD CONSTRAINT sql_version_pkey PRIMARY KEY (id);


--
-- TOC entry 2980 (class 2606 OID 17043)
-- Name: t4c_server t4c_server_pkey; Type: CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.t4c_server
    ADD CONSTRAINT t4c_server_pkey PRIMARY KEY (id);


--
-- TOC entry 2982 (class 2606 OID 17079)
-- Name: windows_version windows_version_pkey; Type: CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.windows_version
    ADD CONSTRAINT windows_version_pkey PRIMARY KEY (id);


--
-- TOC entry 2941 (class 2606 OID 16912)
-- Name: authors authors_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_pk PRIMARY KEY (id);


--
-- TOC entry 2943 (class 2606 OID 16914)
-- Name: authors authors_un; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_un UNIQUE (author_name);


--
-- TOC entry 2945 (class 2606 OID 16916)
-- Name: books books_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books
    ADD CONSTRAINT books_pk PRIMARY KEY (id);


--
-- TOC entry 2947 (class 2606 OID 16918)
-- Name: country_of_born country_of_born_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born
    ADD CONSTRAINT country_of_born_pk PRIMARY KEY (id);


--
-- TOC entry 2949 (class 2606 OID 16920)
-- Name: country_of_born country_of_born_un; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born
    ADD CONSTRAINT country_of_born_un UNIQUE (country);


--
-- TOC entry 2951 (class 2606 OID 16922)
-- Name: persons persons_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.persons
    ADD CONSTRAINT persons_pk PRIMARY KEY (person_id);


--
-- TOC entry 2953 (class 2606 OID 16924)
-- Name: products products_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products
    ADD CONSTRAINT products_pk PRIMARY KEY (product_id);


--
-- TOC entry 2955 (class 2606 OID 16926)
-- Name: year_of_publishing year_of_publishing_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.year_of_publishing
    ADD CONSTRAINT year_of_publishing_pk PRIMARY KEY (id);


--
-- TOC entry 2958 (class 2606 OID 16928)
-- Name: periodicals idx_16480_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals
    ADD CONSTRAINT idx_16480_primary PRIMARY KEY (id);


--
-- TOC entry 2960 (class 2606 OID 16930)
-- Name: periodicals_types idx_16490_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals_types
    ADD CONSTRAINT idx_16490_primary PRIMARY KEY (type);


--
-- TOC entry 2962 (class 2606 OID 16932)
-- Name: subscribes idx_16496_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT idx_16496_primary PRIMARY KEY (id);


--
-- TOC entry 2969 (class 2606 OID 16934)
-- Name: users idx_16507_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users
    ADD CONSTRAINT idx_16507_primary PRIMARY KEY (id);


--
-- TOC entry 2972 (class 2606 OID 16936)
-- Name: users_roles idx_16517_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users_roles
    ADD CONSTRAINT idx_16517_primary PRIMARY KEY (type);


--
-- TOC entry 2984 (class 2606 OID 17097)
-- Name: all_info all_info_pkey; Type: CONSTRAINT; Schema: temp_customer_info; Owner: s_moiseenko
--

ALTER TABLE ONLY temp_customer_info.all_info
    ADD CONSTRAINT all_info_pkey PRIMARY KEY (id);


--
-- TOC entry 2956 (class 1259 OID 16937)
-- Name: idx_16480_periodicals_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16480_periodicals_fk0 ON mywebprojectdb.periodicals USING btree (periodical_type);


--
-- TOC entry 2963 (class 1259 OID 16938)
-- Name: idx_16496_subscribes_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16496_subscribes_fk0 ON mywebprojectdb.subscribes USING btree (user_id);


--
-- TOC entry 2964 (class 1259 OID 16939)
-- Name: idx_16496_subscribes_fk1; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16496_subscribes_fk1 ON mywebprojectdb.subscribes USING btree (periodical_id);


--
-- TOC entry 2965 (class 1259 OID 16940)
-- Name: idx_16507_email; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_email ON mywebprojectdb.users USING btree (email);


--
-- TOC entry 2966 (class 1259 OID 16941)
-- Name: idx_16507_login; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_login ON mywebprojectdb.users USING btree (login);


--
-- TOC entry 2967 (class 1259 OID 16942)
-- Name: idx_16507_phone; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_phone ON mywebprojectdb.users USING btree (phone);


--
-- TOC entry 2970 (class 1259 OID 16943)
-- Name: idx_16507_users_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16507_users_fk0 ON mywebprojectdb.users USING btree (role_type);


--
-- TOC entry 2996 (class 2606 OID 17062)
-- Name: t4c_server fkdygl342bqsng59arc3a8c8rbl; Type: FK CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.t4c_server
    ADD CONSTRAINT fkdygl342bqsng59arc3a8c8rbl FOREIGN KEY (sqlversion_id) REFERENCES customers_info.sql_version(id);


--
-- TOC entry 2995 (class 2606 OID 17057)
-- Name: t4c_server fkeuougxnhtye1ovpp03baoj6jk; Type: FK CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.t4c_server
    ADD CONSTRAINT fkeuougxnhtye1ovpp03baoj6jk FOREIGN KEY (pcinfo_id) REFERENCES customers_info.pc_info(id);


--
-- TOC entry 2994 (class 2606 OID 17052)
-- Name: customer fkg99wb256gi5n7mnx1dcri41ri; Type: FK CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.customer
    ADD CONSTRAINT fkg99wb256gi5n7mnx1dcri41ri FOREIGN KEY (t4cserver_id) REFERENCES customers_info.t4c_server(id);


--
-- TOC entry 2997 (class 2606 OID 17080)
-- Name: t4c_server fkmbdhrayk2x99nai71hylkn1np; Type: FK CONSTRAINT; Schema: customers_info; Owner: s_moiseenko
--

ALTER TABLE ONLY customers_info.t4c_server
    ADD CONSTRAINT fkmbdhrayk2x99nai71hylkn1np FOREIGN KEY (windowsversion_id) REFERENCES customers_info.windows_version(id);


--
-- TOC entry 2985 (class 2606 OID 16944)
-- Name: authors authors_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_fk FOREIGN KEY (country_id) REFERENCES learning_jdbc.country_of_born(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2987 (class 2606 OID 16949)
-- Name: books_authors books_authors_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books_authors
    ADD CONSTRAINT books_authors_fk FOREIGN KEY (author_id) REFERENCES learning_jdbc.authors(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2988 (class 2606 OID 16954)
-- Name: books_authors books_authors_fk_1; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books_authors
    ADD CONSTRAINT books_authors_fk_1 FOREIGN KEY (book_id) REFERENCES learning_jdbc.books(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2986 (class 2606 OID 16959)
-- Name: books books_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books
    ADD CONSTRAINT books_fk FOREIGN KEY (year_id) REFERENCES learning_jdbc.year_of_publishing(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2989 (class 2606 OID 16964)
-- Name: products products_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products
    ADD CONSTRAINT products_fk FOREIGN KEY (person_id) REFERENCES learning_jdbc.persons(person_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2990 (class 2606 OID 16969)
-- Name: periodicals periodicals_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals
    ADD CONSTRAINT periodicals_fk0 FOREIGN KEY (periodical_type) REFERENCES mywebprojectdb.periodicals_types(type);


--
-- TOC entry 2991 (class 2606 OID 16974)
-- Name: subscribes subscribes_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT subscribes_fk0 FOREIGN KEY (user_id) REFERENCES mywebprojectdb.users(id);


--
-- TOC entry 2992 (class 2606 OID 16979)
-- Name: subscribes subscribes_fk1; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT subscribes_fk1 FOREIGN KEY (periodical_id) REFERENCES mywebprojectdb.periodicals(id);


--
-- TOC entry 2993 (class 2606 OID 16984)
-- Name: users users_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users
    ADD CONSTRAINT users_fk0 FOREIGN KEY (role_type) REFERENCES mywebprojectdb.users_roles(type);


--
-- TOC entry 3162 (class 0 OID 0)
-- Dependencies: 10
-- Name: SCHEMA learning_jdbc; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON SCHEMA learning_jdbc TO s_moiseenko;


--
-- TOC entry 3163 (class 0 OID 0)
-- Dependencies: 11
-- Name: SCHEMA mywebprojectdb; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON SCHEMA mywebprojectdb TO s_moiseenko;


--
-- TOC entry 3170 (class 0 OID 0)
-- Dependencies: 206
-- Name: TABLE authors; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.authors TO s_moiseenko;


--
-- TOC entry 3172 (class 0 OID 0)
-- Dependencies: 207
-- Name: SEQUENCE authors_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.authors_id_seq TO s_moiseenko;


--
-- TOC entry 3173 (class 0 OID 0)
-- Dependencies: 208
-- Name: TABLE books; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.books TO s_moiseenko;


--
-- TOC entry 3174 (class 0 OID 0)
-- Dependencies: 209
-- Name: TABLE books_authors; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.books_authors TO s_moiseenko;


--
-- TOC entry 3176 (class 0 OID 0)
-- Dependencies: 210
-- Name: SEQUENCE books_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.books_id_seq TO s_moiseenko;


--
-- TOC entry 3177 (class 0 OID 0)
-- Dependencies: 211
-- Name: TABLE country_of_born; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.country_of_born TO s_moiseenko;


--
-- TOC entry 3179 (class 0 OID 0)
-- Dependencies: 212
-- Name: SEQUENCE country_of_born_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.country_of_born_id_seq TO s_moiseenko;


--
-- TOC entry 3180 (class 0 OID 0)
-- Dependencies: 213
-- Name: TABLE persons; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.persons TO s_moiseenko;


--
-- TOC entry 3182 (class 0 OID 0)
-- Dependencies: 214
-- Name: SEQUENCE persons_person_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.persons_person_id_seq TO s_moiseenko;


--
-- TOC entry 3183 (class 0 OID 0)
-- Dependencies: 215
-- Name: TABLE products; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.products TO s_moiseenko;


--
-- TOC entry 3185 (class 0 OID 0)
-- Dependencies: 216
-- Name: SEQUENCE products_product_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.products_product_id_seq TO s_moiseenko;


--
-- TOC entry 3186 (class 0 OID 0)
-- Dependencies: 217
-- Name: TABLE year_of_publishing; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.year_of_publishing TO s_moiseenko;


--
-- TOC entry 3188 (class 0 OID 0)
-- Dependencies: 218
-- Name: SEQUENCE year_of_publishing_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.year_of_publishing_id_seq TO s_moiseenko;


--
-- TOC entry 3189 (class 0 OID 0)
-- Dependencies: 219
-- Name: TABLE periodicals; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.periodicals TO s_moiseenko;


--
-- TOC entry 3191 (class 0 OID 0)
-- Dependencies: 221
-- Name: TABLE periodicals_types; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.periodicals_types TO s_moiseenko;


--
-- TOC entry 3192 (class 0 OID 0)
-- Dependencies: 222
-- Name: TABLE subscribes; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.subscribes TO s_moiseenko;


--
-- TOC entry 3194 (class 0 OID 0)
-- Dependencies: 224
-- Name: TABLE users; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.users TO s_moiseenko;


--
-- TOC entry 3196 (class 0 OID 0)
-- Dependencies: 226
-- Name: TABLE users_roles; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.users_roles TO s_moiseenko;


-- Completed on 2020-09-21 13:44:55 +03

--
-- PostgreSQL database dump complete
--

