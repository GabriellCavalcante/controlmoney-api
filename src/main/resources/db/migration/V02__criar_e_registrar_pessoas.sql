CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL,
    logradouro VARCHAR(40),
    numero VARCHAR(10),
    complemento VARCHAR(50),
    bairro VARCHAR(30),
    cep VARCHAR(20),
    cidade VARCHAR(30),
    estado VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Maria José', true, 'Rua Elvis Presley', '108', '', 'Mirante da mata', '06720-040', 'Cotia', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Daniela Aguiar', true, 'Rua Augustinho dos Santos', '367', 'Perto do mercado', 'Jd. Nova vida', '06755-120', 'Cotia', 'São Paulo');             
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Evandro Freitas', false, 'Av. Matuzalém', '289', 'Não tem', 'Granja Carolina', '06333-333', 'São Tomé das Letras', 'Minas Gerias');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Adriano Cavalcante', true, 'Travessa dos poetas', '1509', 'Perto do Extra', 'Estelamares', '06730-500', 'Cotia', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Vitor Tolesano', true, 'Av. Dos travecos', '712', 'Muito longe', 'Recanto dos Victors', '06724-024', 'Cidade Perdida', 'Tihuana');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Goku', false, 'Av. kami', '234', 'mais longe ainda', 'não sei', '06724-024', 'Cidade Perdida', 'Planeta terra');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Ricardo', false, 'Av. umdois', '999', 'perto da padaria', 'Lava pés', '06654-022', 'Cotia', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('José', true, 'Av. Bahamas', '888', 'perto do Egito', 'Cidade de Deus', '06722-000', 'Cidade Perdida', 'Planeta terra');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Tom', false, 'Av. Cartoom', '111', 'peto do jerry', 'lá', '06724-123', 'Cidade Cachorro loko', 'Desenho');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
             values ('Doido', false, 'Av. da loucura', '13', null, 'Manicombio', '06724-024', 'Osasco', 'São Paulo');



