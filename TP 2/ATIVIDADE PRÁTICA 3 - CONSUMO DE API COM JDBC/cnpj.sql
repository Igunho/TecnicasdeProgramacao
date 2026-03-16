--
-- PostgreSQL database dump
--

\restrict 4fAolZP77bXW2XeVPfUTUbxJdQ894ZbLjgPoMkTM07lKCD3WmNauAUgBaxoIKAK

-- Dumped from database version 14.22 (Ubuntu 14.22-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.22 (Ubuntu 14.22-0ubuntu0.22.04.1)

-- Started on 2026-03-10 17:05:19 -03

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 98307)
-- Name: EMPRESA; Type: TABLE; Schema: public; Owner: fatec
--

CREATE TABLE public."EMPRESA" (
    cnpj character varying NOT NULL,
    razao_social character varying NOT NULL,
    nome_fantasia character varying NOT NULL,
    logradouro character varying NOT NULL
);


ALTER TABLE public."EMPRESA" OWNER TO fatec;

--
-- TOC entry 210 (class 1259 OID 98314)
-- Name: Socio; Type: TABLE; Schema: public; Owner: fatec
--

CREATE TABLE public."Socio" (
    nome_socio character varying NOT NULL,
    cnpj_cpf_do_socio character varying NOT NULL,
    qualificacao_socio character varying NOT NULL,
    cnpj_empresa character varying NOT NULL
);


ALTER TABLE public."Socio" OWNER TO fatec;

--
-- TOC entry 3356 (class 0 OID 98307)
-- Dependencies: 209
-- Data for Name: EMPRESA; Type: TABLE DATA; Schema: public; Owner: fatec
--

COPY public."EMPRESA" (cnpj, razao_social, nome_fantasia, logradouro) FROM stdin;
\.


--
-- TOC entry 3357 (class 0 OID 98314)
-- Dependencies: 210
-- Data for Name: Socio; Type: TABLE DATA; Schema: public; Owner: fatec
--

COPY public."Socio" (nome_socio, cnpj_cpf_do_socio, qualificacao_socio, cnpj_empresa) FROM stdin;
\.


--
-- TOC entry 3213 (class 2606 OID 98313)
-- Name: EMPRESA Empresa_pkey; Type: CONSTRAINT; Schema: public; Owner: fatec
--

ALTER TABLE ONLY public."EMPRESA"
    ADD CONSTRAINT "Empresa_pkey" PRIMARY KEY (cnpj);


--
-- TOC entry 3215 (class 2606 OID 98320)
-- Name: Socio Socio_pkey; Type: CONSTRAINT; Schema: public; Owner: fatec
--

ALTER TABLE ONLY public."Socio"
    ADD CONSTRAINT "Socio_pkey" PRIMARY KEY (cnpj_cpf_do_socio);


--
-- TOC entry 3216 (class 2606 OID 98321)
-- Name: Socio fk_cnpj_empresa; Type: FK CONSTRAINT; Schema: public; Owner: fatec
--

ALTER TABLE ONLY public."Socio"
    ADD CONSTRAINT fk_cnpj_empresa FOREIGN KEY (cnpj_empresa) REFERENCES public."EMPRESA"(cnpj) NOT VALID;


-- Completed on 2026-03-10 17:05:19 -03

--
-- PostgreSQL database dump complete
--

\unrestrict 4fAolZP77bXW2XeVPfUTUbxJdQ894ZbLjgPoMkTM07lKCD3WmNauAUgBaxoIKAK

