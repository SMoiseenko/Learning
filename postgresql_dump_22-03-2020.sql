--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2 (Ubuntu 12.2-2.pgdg18.04+1)
-- Dumped by pg_dump version 12.2 (Ubuntu 12.2-2.pgdg18.04+1)

-- Started on 2020-03-22 17:05:19 +03

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
-- TOC entry 7 (class 2615 OID 16392)
-- Name: learning_jdbc; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA learning_jdbc;


ALTER SCHEMA learning_jdbc OWNER TO postgres;

--
-- TOC entry 13 (class 2615 OID 16477)
-- Name: mywebprojectdb; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA mywebprojectdb;


ALTER SCHEMA mywebprojectdb OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16395)
-- Name: authors; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.authors (
    id bigint NOT NULL,
    author_name character varying(50) NOT NULL,
    country_id bigint NOT NULL
);


ALTER TABLE learning_jdbc.authors OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16393)
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
-- TOC entry 3094 (class 0 OID 0)
-- Dependencies: 208
-- Name: authors_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.authors_id_seq OWNED BY learning_jdbc.authors.id;


--
-- TOC entry 211 (class 1259 OID 16404)
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
-- TOC entry 212 (class 1259 OID 16411)
-- Name: books_authors; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.books_authors (
    author_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE learning_jdbc.books_authors OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16402)
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
-- TOC entry 3098 (class 0 OID 0)
-- Dependencies: 210
-- Name: books_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.books_id_seq OWNED BY learning_jdbc.books.id;


--
-- TOC entry 214 (class 1259 OID 16419)
-- Name: country_of_born; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.country_of_born (
    id bigint NOT NULL,
    country character varying(50) NOT NULL,
    population bigint
);


ALTER TABLE learning_jdbc.country_of_born OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16417)
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
-- TOC entry 3101 (class 0 OID 0)
-- Dependencies: 213
-- Name: country_of_born_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.country_of_born_id_seq OWNED BY learning_jdbc.country_of_born.id;


--
-- TOC entry 218 (class 1259 OID 16431)
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
-- TOC entry 217 (class 1259 OID 16429)
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
-- TOC entry 3104 (class 0 OID 0)
-- Dependencies: 217
-- Name: persons_person_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.persons_person_id_seq OWNED BY learning_jdbc.persons.person_id;


--
-- TOC entry 220 (class 1259 OID 16440)
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
-- TOC entry 219 (class 1259 OID 16438)
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
-- TOC entry 3107 (class 0 OID 0)
-- Dependencies: 219
-- Name: products_product_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.products_product_id_seq OWNED BY learning_jdbc.products.product_id;


--
-- TOC entry 216 (class 1259 OID 16425)
-- Name: year_of_publishing; Type: TABLE; Schema: learning_jdbc; Owner: postgres
--

CREATE TABLE learning_jdbc.year_of_publishing (
    id bigint NOT NULL,
    year date
);


ALTER TABLE learning_jdbc.year_of_publishing OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16423)
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
-- TOC entry 3110 (class 0 OID 0)
-- Dependencies: 215
-- Name: year_of_publishing_id_seq; Type: SEQUENCE OWNED BY; Schema: learning_jdbc; Owner: postgres
--

ALTER SEQUENCE learning_jdbc.year_of_publishing_id_seq OWNED BY learning_jdbc.year_of_publishing.id;


--
-- TOC entry 222 (class 1259 OID 16480)
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
-- TOC entry 221 (class 1259 OID 16478)
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
-- TOC entry 3113 (class 0 OID 0)
-- Dependencies: 221
-- Name: periodicals_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.periodicals_id_seq OWNED BY mywebprojectdb.periodicals.id;


--
-- TOC entry 223 (class 1259 OID 16490)
-- Name: periodicals_types; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.periodicals_types (
    type character varying(40) NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.periodicals_types OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16496)
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
-- TOC entry 224 (class 1259 OID 16494)
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
-- TOC entry 3116 (class 0 OID 0)
-- Dependencies: 224
-- Name: subscribes_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.subscribes_id_seq OWNED BY mywebprojectdb.subscribes.id;


--
-- TOC entry 227 (class 1259 OID 16507)
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
-- TOC entry 226 (class 1259 OID 16505)
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
-- TOC entry 3118 (class 0 OID 0)
-- Dependencies: 226
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: mywebprojectdb; Owner: postgres
--

ALTER SEQUENCE mywebprojectdb.users_id_seq OWNED BY mywebprojectdb.users.id;


--
-- TOC entry 228 (class 1259 OID 16517)
-- Name: users_roles; Type: TABLE; Schema: mywebprojectdb; Owner: postgres
--

CREATE TABLE mywebprojectdb.users_roles (
    type character varying(40) NOT NULL,
    active boolean DEFAULT true NOT NULL
);


ALTER TABLE mywebprojectdb.users_roles OWNER TO postgres;

--
-- TOC entry 2874 (class 2604 OID 16601)
-- Name: authors id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.authors_id_seq'::regclass);


--
-- TOC entry 2875 (class 2604 OID 16407)
-- Name: books id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.books_id_seq'::regclass);


--
-- TOC entry 2877 (class 2604 OID 16422)
-- Name: country_of_born id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.country_of_born_id_seq'::regclass);


--
-- TOC entry 2879 (class 2604 OID 16434)
-- Name: persons person_id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.persons ALTER COLUMN person_id SET DEFAULT nextval('learning_jdbc.persons_person_id_seq'::regclass);


--
-- TOC entry 2880 (class 2604 OID 16443)
-- Name: products product_id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products ALTER COLUMN product_id SET DEFAULT nextval('learning_jdbc.products_product_id_seq'::regclass);


--
-- TOC entry 2878 (class 2604 OID 16428)
-- Name: year_of_publishing id; Type: DEFAULT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.year_of_publishing ALTER COLUMN id SET DEFAULT nextval('learning_jdbc.year_of_publishing_id_seq'::regclass);


--
-- TOC entry 2881 (class 2604 OID 16483)
-- Name: periodicals id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.periodicals_id_seq'::regclass);


--
-- TOC entry 2886 (class 2604 OID 16499)
-- Name: subscribes id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.subscribes_id_seq'::regclass);


--
-- TOC entry 2892 (class 2604 OID 16510)
-- Name: users id; Type: DEFAULT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users ALTER COLUMN id SET DEFAULT nextval('mywebprojectdb.users_id_seq'::regclass);


--
-- TOC entry 3066 (class 0 OID 16395)
-- Dependencies: 209
-- Data for Name: authors; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.authors (id, author_name, country_id) FROM stdin;
1	Lacy Cluely	20
2	Lindsay Bonifas	22
3	Abbe Begbie	34
4	Emmet Dungay	32
5	Jarred Humberston	1
6	Bobbee Waring	30
7	Tamma Stanlock	2
8	Kaitlin Colten	23
9	Gerta Espinho	33
10	Felice Hindes	30
11	Rodrick Gladdifh	21
12	Farica Cookney	18
13	Hildegarde Largen	19
14	Winifred Stinton	18
15	Celka McCrie	12
16	Warner Bertl	13
17	Dylan Pieroni	17
18	Meredithe Ashborn	35
19	Even Gyurko	13
20	Heinrick Musicka	23
21	Betti Blaise	20
22	Melisent Treadger	19
23	Lorilee Monkman	21
24	Nev Bloy	27
25	Sergent Darcey	18
26	Linda Pountney	12
27	Teddy Hockey	13
28	Esme Muldrew	20
29	Nedi Weldon	32
30	Iggie Lantoph	35
31	Merline Burnhams	15
32	Carney Flockhart	32
33	Adolpho Riddiford	32
34	Katine Harmant	13
35	Tallie Trousdale	24
36	Rheta Brindley	13
37	Lanae De Metz	3
38	Grady Shurmer	21
39	Weidar Alessandretti	20
40	Chane Ballintime	27
41	Valentijn Domini	13
42	Brigida Heynel	9
43	Alden Wiggam	2
44	Padget Dyball	32
45	Drucy Ingleston	15
46	Skipton Hitter	35
47	Erika Chinnick	17
48	Teddie Dailly	30
49	Nora Halcro	14
50	Conway Simonou	25
51	Marthe Lain	15
52	Rubina Dewan	6
53	Dorothee Gergely	8
54	Erena Dresse	11
55	Gabi Kydd	9
56	Caleb Cordeau]	18
57	Wade Royston	37
58	Vonnie Florentine	14
59	Cyrillus Northall	25
60	Deck McPike	10
61	Emmalynne Rumble	10
62	Silvie Camoys	4
63	Korella Vasyaev	21
64	Francois Flewan	5
65	Coleman Trudgion	37
66	Korney Stubbin	14
67	Leta Cousens	5
68	Earle Aston	22
69	Pavla Bengtsson	25
70	Cully Fright	38
71	Phedra Sygroves	16
72	Norbie Flexman	16
73	Mahalia Lambertini	22
74	Gorden Giraudou	14
75	Dori Tollet	28
76	Skyler Josefsson	26
77	Abbe Banaszewski	16
78	Yevette Sigward	24
79	Tedd Parsell	31
80	Laurella Egginton	16
81	Krishna Service	35
82	Kevyn Jankin	29
83	Giorgi Sexton	18
84	Keelby Lushey	25
85	Moss Crop	22
86	Munmro Crawshaw	35
87	Bary Caley	1
88	Mair Fines	27
89	Emlyn Forrestall	32
90	Holt Custy	1
91	Barnabe Codlin	17
92	Flo Hackworthy	6
93	Antonino Bartomeu	36
94	Morgen Siseland	31
95	Shem Waplinton	10
96	Julianna Tarbet	20
97	Eberto Rojel	28
98	Quincy Kirkbright	13
99	Nina Joselin	19
100	Dorris Reddoch	25
101	Dwight Gaitskell	28
102	Ashby Mair	36
103	Erinn Hawthorn	7
104	Kassie Blyde	5
105	Toni Hairsine	7
106	Olenolin Maudlen	32
107	Shae Prattington	10
108	Brett Higgonet	13
109	Terri-jo Meus	14
110	Jenine Bowell	11
111	Almira Elflain	24
112	Robinetta D'Oyley	35
113	Lane Keitch	1
114	Gerhardine Routley	37
115	Almeda Petrichat	27
116	Dorree Malsher	8
117	Obie Fynes	28
118	Marris Szymanowski	26
119	Westley Desforges	11
120	Estelle Bernade	9
121	Bethena Smardon	30
122	Meta Royston	9
123	Golda Crane	31
124	Oneida Bourley	30
125	Pegeen Coventon	11
126	Rosalie Cleugher	4
127	Sullivan McSperrin	2
128	Valery Zukierman	32
129	Wren Fost	28
130	Grace Godman	2
131	Lolita D'Alessandro	7
132	Gustavo Grigolon	5
133	Mason Lowson	5
134	Northrup Ewens	18
135	Sunshine Doughartie	38
136	Thea Botler	12
137	Nollie Vanini	13
138	Domini Woof	39
139	Gaylene Mitro	24
140	Robin Zannuto	4
141	Leisha Gourdon	18
142	Nettle Beauchamp	21
143	Benjy Castan	20
144	Fidelia Wimes	6
145	Cass Ossenna	27
146	Elwira Vanshin	18
147	Rickard Launchbury	12
148	Jarrad Lambeth	19
149	Alameda Donner	15
150	Kerianne Huriche	18
151	Yuri Gandey	33
152	Annabelle Ibell	8
153	Katinka Lowfill	36
154	Easter Bruyet	3
155	Anastasie Dee	3
156	Tani Buckler	35
157	Kelwin Smithend	14
158	Olly Staddom	3
159	Justina Scragg	29
160	Filippa Alennikov	13
161	Melisent Faulkener	2
162	Lorette Astall	26
163	Arnie Josham	17
164	Rinaldo Fearneley	5
165	Anna Garrould	24
166	Melly Morefield	28
167	Chiarra Corradi	15
168	Gene Adamek	15
169	Marisa Solomonides	21
170	Laverna Stallworthy	15
171	Koral Hastewell	11
172	Cecile Burnet	23
173	Sharia Matyugin	31
174	Cherilynn Kun	28
175	Valentia Dalli	6
176	Demetris Shelp	37
177	Cyrill Marling	18
178	Ninette Gouth	14
179	Eryn Wagenen	16
180	Collie MacArd	25
181	Sherwood Grinham	2
182	Kerk Harcarse	10
183	Mord Jinks	29
184	Bess Slarke	10
185	Jaime Jeppe	33
186	Dorette Bellelli	6
187	Pearle Sealand	33
188	Rob Swallow	4
189	Wilmer Parkins	20
190	Hope Carlett	12
191	Randal Anderbrugge	32
192	Elane Leander	12
193	Hillary Wynne	11
194	Grenville Keeler	11
195	Analiese Aspel	10
196	Krissy Portt	4
197	Adel Andric	4
198	Avis Grisbrook	13
199	Duff Moreton	15
200	Consolata Tatlowe	26
201	Dodie Eslemont	30
202	Reiko Screach	8
203	Vassili Fearnyhough	4
204	Hailey Pottes	16
205	Brooks Laffan	16
206	Thornie McIlwraith	15
207	Charissa Gouley	35
208	Salome Tithecote	18
209	Ingelbert Govenlock	15
210	Christopher Battleson	5
211	Tiffie Challin	13
212	Ned Wiz	22
213	Robinet Gennrich	2
214	Ysabel Crickmoor	2
215	Andrei Polgreen	37
216	Jerald Sheron	29
217	Roana Barkas	36
218	Isabelle Mowatt	39
219	Deanne Frodsam	20
220	Mattias Zum Felde	13
221	Rudolfo Points	8
222	Guntar Pauls	6
223	Lorri Preon	16
224	Abbe Vashchenko	22
225	Quinton Donat	39
226	Rowland Donavan	2
227	Alisander Thexton	14
228	Tonnie Matevosian	34
229	Pietro Joel	34
230	Britni Burnip	12
231	Patience Washbrook	36
232	Pansie MacCart	13
233	Dana Dafydd	19
234	Jeanie Hacking	24
235	Haven Kingscott	9
236	Fidela Gocher	18
237	Cart Cramond	6
238	Bendix Ionn	30
239	Edy Rabat	28
240	Olin Le Galle	36
241	Emlyn Boanas	30
242	Forrester Greenman	16
243	Chiarra MacVay	23
244	Marianna Giacopelo	29
245	Boycey Doorly	22
246	Huberto Dunhill	37
247	Chariot Watkins	34
248	Ambur Skilbeck	22
249	Artie Parmiter	26
250	Cherida Conville	3
251	Huan Abdurahman	17
\.


--
-- TOC entry 3068 (class 0 OID 16404)
-- Dependencies: 211
-- Data for Name: books; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.books (id, book_name, year_id, price) FROM stdin;
1	Tampflex	22	0
2	Cardguard	15	0
3	Stim	34	0
4	Matsoft	11	0
5	Stronghold	24	0
6	Flowdesk	10	0
7	Fintone	3	0
8	Regrant	9	0
9	Namfix	26	0
10	Viva	32	0
11	Prodder	23	0
12	Wrapsafe	4	0
13	Zathin	11	0
14	Konklux	34	0
15	Voyatouch	16	0
16	Veribet	40	0
17	Bigtax	4	0
18	Solarbreeze	18	0
19	Home Ing	18	0
20	Bytecard	6	0
21	Quo Lux	22	0
22	Span	1	0
23	Ronstring	20	0
24	Tin	28	0
25	Duobam	27	0
26	Trippledex	23	0
27	Latlux	2	0
28	Bitwolf	27	0
29	Holdlamis	8	0
30	Gembucket	11	0
31	Fixflex	8	0
32	Transcof	16	0
33	Kanlam	16	0
34	Aerified	6	0
35	Pannier	22	0
36	Flexidy	6	0
37	Toughjoyfax	14	0
38	Overhold	33	0
39	Sub-Ex	40	0
40	Ventosanzap	1	0
41	Bitchip	28	0
42	Bamity	28	0
43	Alphazap	26	0
44	Cookley	9	0
45	Biodex	15	0
46	Tresom	14	0
47	Keylex	34	0
48	Temp	3	0
49	Zoolab	24	0
50	Tres-Zap	22	0
51	Andalax	36	0
52	Opela	29	0
53	Treeflex	37	0
54	Voltsillam	34	0
55	Daltfresh	36	0
56	Cardify	9	0
57	Asoka	8	0
58	Rank	31	0
59	Subin	6	0
60	Greenlam	2	0
61	Zontrax	11	0
62	Konklab	24	0
63	Zaam-Dox	12	0
64	Mat Lam Tam	36	0
65	Stringtough	24	0
66	Y-Solowarm	10	0
67	Otcom	13	0
68	Hatity	6	0
69	Zamit	26	0
70	Fix San	39	0
71	Domainer	24	0
72	Sonair	28	0
73	Job	11	0
74	Redhold	23	0
75	Lotlux	28	0
76	Vagram	8	0
77	Y-find	3	0
78	It	27	0
79	Alpha	5	0
80	Lotstring	37	0
81	Tempsoft	28	0
128	The Story Of Univerce	41	0
\.


--
-- TOC entry 3069 (class 0 OID 16411)
-- Dependencies: 212
-- Data for Name: books_authors; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.books_authors (author_id, book_id) FROM stdin;
1	71
1	74
1	81
2	26
2	33
2	76
3	30
3	38
3	80
4	5
4	55
4	70
4	72
4	74
5	3
5	41
5	52
5	59
6	76
7	25
7	44
7	45
8	29
8	36
8	42
8	57
9	33
9	40
10	29
10	45
10	47
10	52
11	73
12	17
13	11
13	40
14	62
15	32
15	46
15	60
15	65
16	26
16	41
16	64
16	78
17	13
18	31
18	55
19	23
19	30
20	5
20	22
20	44
20	73
21	4
21	19
21	55
22	29
22	37
22	65
22	79
23	18
23	35
24	2
24	37
24	72
25	19
25	33
25	37
25	58
25	67
25	71
26	9
27	7
27	62
27	63
27	77
27	81
29	9
29	22
30	9
30	10
30	44
31	18
31	23
31	46
31	53
31	60
31	72
32	20
32	39
33	6
33	66
34	5
34	6
34	39
34	52
34	56
34	73
34	76
34	80
35	4
35	8
35	26
35	36
35	63
35	78
36	64
36	68
36	73
36	75
37	25
37	36
37	44
37	45
37	48
38	14
38	15
38	26
38	37
38	42
38	44
38	50
38	69
39	17
39	22
39	34
39	37
39	46
39	53
39	78
41	1
41	2
41	38
41	61
41	73
42	12
42	71
43	72
44	10
44	24
44	66
45	20
45	44
46	2
46	7
46	36
46	45
46	69
48	7
50	15
50	32
50	44
50	64
50	69
51	17
51	27
51	30
51	42
52	9
52	31
52	45
52	78
53	51
54	5
54	9
54	76
55	23
55	40
55	49
56	12
56	20
56	72
57	30
57	47
57	53
57	59
57	60
57	67
57	71
58	35
58	36
58	58
58	78
59	14
59	33
59	34
59	43
59	45
59	68
60	55
60	68
60	72
61	29
62	20
62	23
62	66
62	75
63	3
63	8
63	39
63	53
63	62
63	70
64	1
64	4
64	40
64	49
64	52
65	22
65	40
65	62
66	1
66	24
66	28
66	35
66	60
67	10
67	63
67	67
67	70
68	28
68	32
68	42
68	66
69	37
70	59
71	8
71	39
71	54
72	22
72	39
72	79
73	1
74	18
75	36
75	79
76	27
77	27
77	65
78	8
78	27
78	41
78	68
79	8
79	13
79	19
79	25
79	51
79	81
80	20
80	35
80	61
80	76
82	65
82	76
83	17
83	22
83	27
83	80
85	1
85	41
85	58
85	81
86	27
87	2
87	37
87	63
88	46
89	45
89	68
90	7
90	12
90	70
90	75
91	35
91	53
93	10
93	16
93	18
93	21
93	32
93	72
93	75
94	32
94	38
94	66
94	79
95	28
96	70
97	45
98	37
98	48
98	57
98	78
99	3
99	9
99	33
99	39
99	42
99	47
99	66
100	17
100	26
100	51
100	56
100	57
100	63
100	74
100	79
101	16
101	35
101	46
102	33
102	71
103	6
103	23
103	41
103	52
103	77
104	48
105	29
105	32
105	67
106	39
106	46
107	63
108	25
109	2
109	5
109	15
109	67
109	71
109	72
110	1
110	5
110	16
110	52
110	80
111	15
111	24
111	38
111	55
112	13
112	61
112	68
113	10
113	25
113	73
114	6
114	42
114	53
114	64
115	54
116	68
116	72
117	1
117	50
118	45
118	55
118	79
119	1
119	10
119	18
119	31
119	39
119	50
119	52
119	57
119	60
120	64
120	77
121	35
122	33
123	12
123	17
123	44
123	45
124	3
124	9
124	52
124	55
125	23
125	39
125	42
125	43
125	48
125	69
126	27
126	49
126	56
127	4
127	15
128	70
129	60
129	73
130	3
130	17
130	42
130	46
130	65
131	35
131	62
131	81
132	26
132	66
133	25
133	61
134	1
134	33
134	38
134	60
134	66
135	12
135	44
136	7
137	43
137	63
138	23
139	57
140	72
141	11
141	42
142	1
142	37
143	3
143	33
143	49
145	12
146	20
146	29
146	41
148	4
148	75
149	9
149	44
149	46
149	49
149	58
151	13
151	55
151	73
152	16
153	34
154	71
155	30
155	35
156	3
156	6
156	41
156	56
156	69
156	77
156	81
157	1
157	8
157	39
157	41
157	47
158	50
158	66
159	31
159	43
160	17
160	61
161	35
161	44
162	2
162	44
162	78
163	37
163	70
163	78
164	7
164	71
165	18
165	67
166	21
166	65
166	66
167	8
167	46
167	57
167	59
167	80
168	8
168	23
168	32
168	59
168	73
169	72
169	77
170	8
170	45
170	79
171	2
171	30
171	48
172	11
172	54
172	58
174	9
174	46
174	65
175	11
175	22
175	41
175	65
175	67
176	36
176	45
176	58
177	34
177	69
178	13
178	16
178	39
178	81
179	30
179	46
179	76
179	78
180	15
180	16
180	44
181	3
181	5
181	57
181	63
181	75
182	14
182	26
182	30
182	47
183	50
183	64
183	69
184	1
184	47
185	16
185	41
185	51
185	75
185	77
185	79
186	10
186	44
187	4
187	33
187	44
189	14
189	24
189	43
189	59
190	77
191	27
192	6
192	12
192	34
193	10
193	14
193	54
193	65
193	75
193	79
194	74
194	77
195	10
195	27
195	31
195	65
196	6
196	46
197	27
197	28
197	42
197	53
197	71
198	18
198	66
200	18
200	28
200	41
200	65
201	12
201	31
201	38
201	55
201	70
202	6
202	17
202	38
202	48
202	49
202	56
202	60
202	80
203	35
204	57
205	25
205	54
206	3
206	19
206	46
206	50
206	60
207	35
207	40
207	52
207	59
208	33
208	52
208	79
209	14
209	41
210	34
210	39
210	72
211	19
211	75
212	19
212	23
212	34
212	68
213	37
213	73
214	29
215	11
215	12
215	17
215	20
215	27
215	46
215	71
217	10
217	24
217	33
218	9
218	17
218	34
219	4
219	28
219	39
220	28
220	66
221	3
221	14
221	23
221	58
222	4
222	49
223	38
223	50
224	33
226	29
226	36
227	17
227	29
227	50
228	3
228	26
228	70
228	73
229	55
229	61
229	67
230	10
230	18
230	26
230	49
230	58
230	70
231	16
231	30
231	42
231	46
232	9
232	24
232	51
232	79
233	74
233	75
234	55
234	70
235	36
235	49
235	50
236	14
236	73
237	72
237	80
238	2
238	23
238	81
239	16
239	34
239	38
239	42
239	67
240	15
240	23
240	41
241	52
241	70
242	20
242	58
243	19
243	37
243	41
243	43
243	62
244	47
244	52
244	54
245	48
245	56
246	1
246	29
246	68
247	63
248	6
248	20
248	52
249	11
249	29
249	42
249	60
249	65
249	67
250	5
250	19
250	48
250	56
199	53
199	128
216	29
216	56
216	68
216	128
225	56
225	128
\.


--
-- TOC entry 3071 (class 0 OID 16419)
-- Dependencies: 214
-- Data for Name: country_of_born; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.country_of_born (id, country, population) FROM stdin;
1	China	1439323776
2	Ukraine	43733762
3	Uganda	45741007
4	Venezuela	28435940
5	Iran	83992949
6	Kazakhstan	18776707
7	Brazil	212559417
8	Poland	37846611
9	Indonesia	273523615
10	Japan	126476461
11	Czech Republic	10708981
12	Sweden	10099265
13	Philippines	109581078
14	France	65273511
15	Russia	145934462
16	Ethiopia	114963588
18	Tajikistan	9537645
19	United States	331002651
20	Angola	32866272
21	Bosnia and Herzegovina	3280819
22	Egypt	102334404
23	Syria	17500658
24	Saudi Arabia	34813871
25	Malaysia	32365999
26	Thailand	69799978
27	Mongolia	3278290
28	Morocco	36910560
29	Cuba	1326616
30	South Korea	51269185
31	Nicaragua	6624554
32	Denmark	5792202
33	Argentina	45195774
34	Mauritania	4649658
35	Ivory Coast	26378274
36	Jamaica	2961167
37	Slovenia	2078938
38	Benin	12123200
39	Colombia	50882891
17	Portugal	10196709
\.


--
-- TOC entry 3075 (class 0 OID 16431)
-- Dependencies: 218
-- Data for Name: persons; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.persons (person_id, person_login, person_password, person_first_name, person_last_name, person_date_of_birth, person_salary) FROM stdin;
4	megabrain	$2a$05$hXr8rQb6TUhm49Cwncf/6OeCtR7W6wW/FQEmnTnUpTrsXIby8VNnO	Albert	Einstain	1879-03-14	3500.00
5	стасямба	$2a$05$UNL9A1RftCTFV6LTD3xn7O8i1n3hJBliZS3ZcY/JRnqkFzqP7A8iu	Станистав	Кину Где Попало	1986-09-14	500.00
10	Siarhei	$2a$05$jyGrPd26X0oSUwAkS0Oc4upM/FG39jGpukcbqZYW4HjNH9L/ciMsy	Siarhei	Melez	1965-07-02	320.00
11	sequoya	$2a$05$KWnIcxKVHOrCTscNRCwSaukfgJW0w5ghbKV08ixXs3W5vfjTRQuOC	Sequoya	The Three	0001-01-01	50000.00
12	astronaut	$2a$05$PSQldTmCUzgTjmggL5l0t.iadQMLoT1DLW2Ut1GCvSXMFj/zN9Gdu	Astronaut	A5 Naebali	2019-05-15	1.00
13	juno	$2a$05$Y1JgFJ0GtpYVywIiVJe4TuVMXX8EbbnMPw20Fv6O8BpAl.LGlald.	Lely	Juno	2010-03-15	357.00
18	Hash	$2a$05$KrCR5qqxntc.JO/kqAAbt.ejGbQ2pdLUpstDubqjz3SM/WMT5W9de	Hash	User	1965-02-21	0.00
19	test	$2a$05$FwOH5H2OLR.qENy9YvW6p.MnIUSvvY1ZT8XL.l4wCIj6JrBHZlWG.	TeSt	tEsT	1985-06-19	0.00
\.


--
-- TOC entry 3077 (class 0 OID 16440)
-- Dependencies: 220
-- Data for Name: products; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.products (product_id, product_name, product_price, person_id) FROM stdin;
25	молоко	1.25	4
27	молоко	1.25	4
28	Milk	1.15	4
29	Milk	1.15	4
30	КАРТОШКА	1.15	5
31	PC	1530.00	13
32	Iphone	43.00	13
33	Soup	7.50	13
34	LapTop	789.00	13
35	Bread	5.00	13
36	Lamp	3.20	13
37	TV	769.00	13
38	VHC Tape	1.00	13
39	Cd	32.00	13
40	mleco	5.00	13
41	Тетрадь	1.20	13
\.


--
-- TOC entry 3073 (class 0 OID 16425)
-- Dependencies: 216
-- Data for Name: year_of_publishing; Type: TABLE DATA; Schema: learning_jdbc; Owner: postgres
--

COPY learning_jdbc.year_of_publishing (id, year) FROM stdin;
35	1917-08-07
24	1917-12-03
27	1919-03-18
23	1921-04-12
12	1922-11-19
7	1924-09-01
13	1930-01-07
16	1931-11-27
9	1932-10-07
39	1935-02-02
38	1944-10-17
18	1947-02-05
1	1947-02-22
31	1949-07-30
10	1950-03-16
30	1950-06-22
36	1950-09-06
32	1960-10-29
3	1964-11-13
37	1966-07-27
11	1967-09-08
19	1971-10-03
26	1974-08-31
4	1975-04-25
34	1979-01-01
6	1984-11-05
40	1986-02-07
21	1986-03-15
29	1989-07-03
28	1994-11-26
17	1995-08-07
20	1995-08-16
5	1997-06-11
41	1998-07-26
22	1999-01-06
8	2007-09-05
15	2009-06-28
14	2013-08-17
33	2014-08-05
2	2017-12-08
25	2017-12-14
\.


--
-- TOC entry 3079 (class 0 OID 16480)
-- Dependencies: 222
-- Data for Name: periodicals; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

COPY mywebprojectdb.periodicals (id, issn, periodical_type, title, description, qty_per_year, price, active) FROM stdin;
1	0190-8286	NEWSPAPPER	The Washington Post	The Washington Post (sometimes abbreviated as WaPo) is a major American daily newspaper published in Washington, D.C., with a particular emphasis on national politics and the federal government. It has the largest circulation in the Washington metropolitan area. Its slogan "Democracy Dies in Darkness" began appearing on its masthead in 2017. Daily broadsheet editions are printed for the District of Columbia, Maryland, and Virginia.	365	0.35	t
2	0362-4331	NEWSPAPPER	The New York Times	The New York Times (shortened as The Times and abbreviated as The NYT) is an American newspaper based in New York City with worldwide influence and readership.Founded in 1851, the paper has won 125 Pulitzer Prizes, more than any other newspaper. The Times is ranked 17th in the world by circulation and 2nd in the U.S. 	365	0.50	t
3	1992-3058	UNDEFINED	СБ. Беларусь сегодня	Белорусская общественно-политическая газета. Издаётся с августа 1927 года. Выходит 5 раз в неделю. Учредители — Администрация президента Республики Беларусь и редакционный совет. На декабрь 2013 года тираж — 400 614 экземпляров. Крупнейшее печатное СМИ страны. В последние годы выходит под брендом ≪СБ. Беларусь сегодня≫. 	270	0.37	t
4	5894-4521	UNDEFINED	Marvel Adventures	Marvel Adventures, formerly Marvel Age, was an imprint of Marvel Comics intended for younger audiences, including small children. Unlike the standard comics published by Marvel, which often take place in story arcs spanning several issues, each Marvel Adventures comic tells a standalone story. In April 2012 it was replaced by all new All Ages line tied to the Marvel Universe block on Disney XD.	12	17.00	t
5	3256-4521	UNDEFINED	Batman	Batman is an ongoing American comic book series featuring the DC Comics superhero Batman as its main protagonist. The character first appeared in Detective Comics #27 (cover dated May 1939). Batman proved to be so popular that a self-titled ongoing comic book series began publication with a cover date of Spring 1940. It was first advertised in early April 1940, one month after the first appearance of his new sidekick, Robin, the Boy Wonder. 	54	17.19	t
6	3697-5428	UNDEFINED	Наша нива	Начала выходить в Вильне с 10 (23) ноября 1906 по 7 августа 1915 на белорусском языке кириллицей и с первого номера до № 42, 18 (31) октября 1912) также белорусской латиницей, с заглавиями «Наша Ніва» и «Nasza Niwa».  Редакторы-издатели З. Вольский, А. Власов, И. Луцкевич. Печаталась в типографии Мартина Кухты. 	12	0.55	t
7	3587-8542	UNDEFINED	Marvel	Spider-Man	54	2.50	f
8	1234-4321	UNDEFINED	Enter title	Enter description	0	0.00	f
9	1234-4321	NEWSPAPPER	Перспектива	Перспективы нЭт	500	15.00	f
10	1234-4321	NEWSPAPPER	Советская белорусия	Как хорошо живется у нас в стране	365	100.00	f
11	1145-8545	UNDEFINED	ТЕперь мы periodicals	Enter descriptionon	15	20.00	f
12	1234-4321	UNDEFINED	djdghk	Enter descriptiodghkfghjdfn	0	0.00	f
13	5569-	UNDEFINED	Enter title	Enter description	0	0.00	f
\.


--
-- TOC entry 3080 (class 0 OID 16490)
-- Dependencies: 223
-- Data for Name: periodicals_types; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

COPY mywebprojectdb.periodicals_types (type, active) FROM stdin;
COMIC	t
NEWSPAPPER	t
SCIENCE_MAGAZINE	t
UNDEFINED	t
\.


--
-- TOC entry 3082 (class 0 OID 16496)
-- Dependencies: 225
-- Data for Name: subscribes; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

COPY mywebprojectdb.subscribes (id, user_id, periodical_id, total_price, paid, months_of_subscription, date_begin_subscribe, date_end_subscribe, payment_status, active) FROM stdin;
11	2	4	17.00	0.00	1	2018-12-20	2019-01-20	f	t
12	2	5	1107.00	0.00	12	2018-12-20	2019-12-20	f	t
13	2	5	266.50	0.00	3	2018-12-20	2019-03-20	f	t
\.


--
-- TOC entry 3084 (class 0 OID 16507)
-- Dependencies: 227
-- Data for Name: users; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

COPY mywebprojectdb.users (id, login, password, role_type, first_name, last_name, email, phone, address, balance, active) FROM stdin;
1	admin	admin	ADMIN	Admin	Adminovich	admin@admin.com	+375295556666	230025, Grodno, Kirova str., 1 	100.00	t
2	nikola	tesla	CUSTOMER	Nikola	Tesla	nikolatesla@tut.by	+12123633200	10004, New York city	1000.00	t
6	testuser	12345678	CUSTOMER	Вася	Пупкин	vasilij.pupkin@gmail.com	+375296666666	230026 Grodno, Kleckova 26	0.00	t
8	sidor	sidor	CUSTOMER	Sidor	Sidorovich	sidor@gmail.com	+325698547	36547, Belarus	0.00	t
\.


--
-- TOC entry 3085 (class 0 OID 16517)
-- Dependencies: 228
-- Data for Name: users_roles; Type: TABLE DATA; Schema: mywebprojectdb; Owner: postgres
--

COPY mywebprojectdb.users_roles (type, active) FROM stdin;
ADMIN	t
ANONYMOUS	f
CUSTOMER	t
\.


--
-- TOC entry 3120 (class 0 OID 0)
-- Dependencies: 208
-- Name: authors_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.authors_id_seq', 251, true);


--
-- TOC entry 3121 (class 0 OID 0)
-- Dependencies: 210
-- Name: books_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.books_id_seq', 128, true);


--
-- TOC entry 3122 (class 0 OID 0)
-- Dependencies: 213
-- Name: country_of_born_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.country_of_born_id_seq', 39, true);


--
-- TOC entry 3123 (class 0 OID 0)
-- Dependencies: 217
-- Name: persons_person_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.persons_person_id_seq', 19, true);


--
-- TOC entry 3124 (class 0 OID 0)
-- Dependencies: 219
-- Name: products_product_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.products_product_id_seq', 41, true);


--
-- TOC entry 3125 (class 0 OID 0)
-- Dependencies: 215
-- Name: year_of_publishing_id_seq; Type: SEQUENCE SET; Schema: learning_jdbc; Owner: postgres
--

SELECT pg_catalog.setval('learning_jdbc.year_of_publishing_id_seq', 41, true);


--
-- TOC entry 3126 (class 0 OID 0)
-- Dependencies: 221
-- Name: periodicals_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.periodicals_id_seq', 13, true);


--
-- TOC entry 3127 (class 0 OID 0)
-- Dependencies: 224
-- Name: subscribes_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.subscribes_id_seq', 13, true);


--
-- TOC entry 3128 (class 0 OID 0)
-- Dependencies: 226
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: mywebprojectdb; Owner: postgres
--

SELECT pg_catalog.setval('mywebprojectdb.users_id_seq', 8, true);


--
-- TOC entry 2898 (class 2606 OID 16600)
-- Name: authors authors_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_pk PRIMARY KEY (id);


--
-- TOC entry 2900 (class 2606 OID 16571)
-- Name: authors authors_un; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_un UNIQUE (author_name);


--
-- TOC entry 2902 (class 2606 OID 16622)
-- Name: books books_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books
    ADD CONSTRAINT books_pk PRIMARY KEY (id);


--
-- TOC entry 2904 (class 2606 OID 16565)
-- Name: country_of_born country_of_born_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born
    ADD CONSTRAINT country_of_born_pk PRIMARY KEY (id);


--
-- TOC entry 2906 (class 2606 OID 16567)
-- Name: country_of_born country_of_born_un; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.country_of_born
    ADD CONSTRAINT country_of_born_un UNIQUE (country);


--
-- TOC entry 2910 (class 2606 OID 16656)
-- Name: persons persons_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.persons
    ADD CONSTRAINT persons_pk PRIMARY KEY (person_id);


--
-- TOC entry 2912 (class 2606 OID 16654)
-- Name: products products_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products
    ADD CONSTRAINT products_pk PRIMARY KEY (product_id);


--
-- TOC entry 2908 (class 2606 OID 16620)
-- Name: year_of_publishing year_of_publishing_pk; Type: CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.year_of_publishing
    ADD CONSTRAINT year_of_publishing_pk PRIMARY KEY (id);


--
-- TOC entry 2915 (class 2606 OID 16540)
-- Name: periodicals idx_16480_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals
    ADD CONSTRAINT idx_16480_primary PRIMARY KEY (id);


--
-- TOC entry 2917 (class 2606 OID 16538)
-- Name: periodicals_types idx_16490_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals_types
    ADD CONSTRAINT idx_16490_primary PRIMARY KEY (type);


--
-- TOC entry 2919 (class 2606 OID 16539)
-- Name: subscribes idx_16496_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT idx_16496_primary PRIMARY KEY (id);


--
-- TOC entry 2926 (class 2606 OID 16542)
-- Name: users idx_16507_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users
    ADD CONSTRAINT idx_16507_primary PRIMARY KEY (id);


--
-- TOC entry 2929 (class 2606 OID 16541)
-- Name: users_roles idx_16517_primary; Type: CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users_roles
    ADD CONSTRAINT idx_16517_primary PRIMARY KEY (type);


--
-- TOC entry 2913 (class 1259 OID 16526)
-- Name: idx_16480_periodicals_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16480_periodicals_fk0 ON mywebprojectdb.periodicals USING btree (periodical_type);


--
-- TOC entry 2920 (class 1259 OID 16525)
-- Name: idx_16496_subscribes_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16496_subscribes_fk0 ON mywebprojectdb.subscribes USING btree (user_id);


--
-- TOC entry 2921 (class 1259 OID 16522)
-- Name: idx_16496_subscribes_fk1; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16496_subscribes_fk1 ON mywebprojectdb.subscribes USING btree (periodical_id);


--
-- TOC entry 2922 (class 1259 OID 16530)
-- Name: idx_16507_email; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_email ON mywebprojectdb.users USING btree (email);


--
-- TOC entry 2923 (class 1259 OID 16528)
-- Name: idx_16507_login; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_login ON mywebprojectdb.users USING btree (login);


--
-- TOC entry 2924 (class 1259 OID 16532)
-- Name: idx_16507_phone; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE UNIQUE INDEX idx_16507_phone ON mywebprojectdb.users USING btree (phone);


--
-- TOC entry 2927 (class 1259 OID 16531)
-- Name: idx_16507_users_fk0; Type: INDEX; Schema: mywebprojectdb; Owner: postgres
--

CREATE INDEX idx_16507_users_fk0 ON mywebprojectdb.users USING btree (role_type);


--
-- TOC entry 2930 (class 2606 OID 16607)
-- Name: authors authors_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.authors
    ADD CONSTRAINT authors_fk FOREIGN KEY (country_id) REFERENCES learning_jdbc.country_of_born(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2932 (class 2606 OID 16643)
-- Name: books_authors books_authors_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books_authors
    ADD CONSTRAINT books_authors_fk FOREIGN KEY (author_id) REFERENCES learning_jdbc.authors(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2933 (class 2606 OID 16648)
-- Name: books_authors books_authors_fk_1; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books_authors
    ADD CONSTRAINT books_authors_fk_1 FOREIGN KEY (book_id) REFERENCES learning_jdbc.books(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2931 (class 2606 OID 16623)
-- Name: books books_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.books
    ADD CONSTRAINT books_fk FOREIGN KEY (year_id) REFERENCES learning_jdbc.year_of_publishing(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2934 (class 2606 OID 16657)
-- Name: products products_fk; Type: FK CONSTRAINT; Schema: learning_jdbc; Owner: postgres
--

ALTER TABLE ONLY learning_jdbc.products
    ADD CONSTRAINT products_fk FOREIGN KEY (person_id) REFERENCES learning_jdbc.persons(person_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2935 (class 2606 OID 16543)
-- Name: periodicals periodicals_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.periodicals
    ADD CONSTRAINT periodicals_fk0 FOREIGN KEY (periodical_type) REFERENCES mywebprojectdb.periodicals_types(type);


--
-- TOC entry 2936 (class 2606 OID 16548)
-- Name: subscribes subscribes_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT subscribes_fk0 FOREIGN KEY (user_id) REFERENCES mywebprojectdb.users(id);


--
-- TOC entry 2937 (class 2606 OID 16553)
-- Name: subscribes subscribes_fk1; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.subscribes
    ADD CONSTRAINT subscribes_fk1 FOREIGN KEY (periodical_id) REFERENCES mywebprojectdb.periodicals(id);


--
-- TOC entry 2938 (class 2606 OID 16558)
-- Name: users users_fk0; Type: FK CONSTRAINT; Schema: mywebprojectdb; Owner: postgres
--

ALTER TABLE ONLY mywebprojectdb.users
    ADD CONSTRAINT users_fk0 FOREIGN KEY (role_type) REFERENCES mywebprojectdb.users_roles(type);


--
-- TOC entry 3091 (class 0 OID 0)
-- Dependencies: 7
-- Name: SCHEMA learning_jdbc; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON SCHEMA learning_jdbc TO s_moiseenko;


--
-- TOC entry 3092 (class 0 OID 0)
-- Dependencies: 13
-- Name: SCHEMA mywebprojectdb; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON SCHEMA mywebprojectdb TO s_moiseenko;


--
-- TOC entry 3093 (class 0 OID 0)
-- Dependencies: 209
-- Name: TABLE authors; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.authors TO s_moiseenko;


--
-- TOC entry 3095 (class 0 OID 0)
-- Dependencies: 208
-- Name: SEQUENCE authors_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.authors_id_seq TO s_moiseenko;


--
-- TOC entry 3096 (class 0 OID 0)
-- Dependencies: 211
-- Name: TABLE books; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.books TO s_moiseenko;


--
-- TOC entry 3097 (class 0 OID 0)
-- Dependencies: 212
-- Name: TABLE books_authors; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.books_authors TO s_moiseenko;


--
-- TOC entry 3099 (class 0 OID 0)
-- Dependencies: 210
-- Name: SEQUENCE books_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.books_id_seq TO s_moiseenko;


--
-- TOC entry 3100 (class 0 OID 0)
-- Dependencies: 214
-- Name: TABLE country_of_born; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.country_of_born TO s_moiseenko;


--
-- TOC entry 3102 (class 0 OID 0)
-- Dependencies: 213
-- Name: SEQUENCE country_of_born_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.country_of_born_id_seq TO s_moiseenko;


--
-- TOC entry 3103 (class 0 OID 0)
-- Dependencies: 218
-- Name: TABLE persons; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.persons TO s_moiseenko;


--
-- TOC entry 3105 (class 0 OID 0)
-- Dependencies: 217
-- Name: SEQUENCE persons_person_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.persons_person_id_seq TO s_moiseenko;


--
-- TOC entry 3106 (class 0 OID 0)
-- Dependencies: 220
-- Name: TABLE products; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.products TO s_moiseenko;


--
-- TOC entry 3108 (class 0 OID 0)
-- Dependencies: 219
-- Name: SEQUENCE products_product_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.products_product_id_seq TO s_moiseenko;


--
-- TOC entry 3109 (class 0 OID 0)
-- Dependencies: 216
-- Name: TABLE year_of_publishing; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON TABLE learning_jdbc.year_of_publishing TO s_moiseenko;


--
-- TOC entry 3111 (class 0 OID 0)
-- Dependencies: 215
-- Name: SEQUENCE year_of_publishing_id_seq; Type: ACL; Schema: learning_jdbc; Owner: postgres
--

GRANT ALL ON SEQUENCE learning_jdbc.year_of_publishing_id_seq TO s_moiseenko;


--
-- TOC entry 3112 (class 0 OID 0)
-- Dependencies: 222
-- Name: TABLE periodicals; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.periodicals TO s_moiseenko;


--
-- TOC entry 3114 (class 0 OID 0)
-- Dependencies: 223
-- Name: TABLE periodicals_types; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.periodicals_types TO s_moiseenko;


--
-- TOC entry 3115 (class 0 OID 0)
-- Dependencies: 225
-- Name: TABLE subscribes; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.subscribes TO s_moiseenko;


--
-- TOC entry 3117 (class 0 OID 0)
-- Dependencies: 227
-- Name: TABLE users; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.users TO s_moiseenko;


--
-- TOC entry 3119 (class 0 OID 0)
-- Dependencies: 228
-- Name: TABLE users_roles; Type: ACL; Schema: mywebprojectdb; Owner: postgres
--

GRANT ALL ON TABLE mywebprojectdb.users_roles TO s_moiseenko;


-- Completed on 2020-03-22 17:05:19 +03

--
-- PostgreSQL database dump complete
--
