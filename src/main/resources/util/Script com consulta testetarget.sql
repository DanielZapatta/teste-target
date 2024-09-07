CREATE DATABASE TesteTarget;

USE TesteTarget;

CREATE TABLE Estados (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    codigo VARCHAR(2)
);

CREATE TABLE Clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    estado_id INT,
    FOREIGN KEY (estado_id) REFERENCES Estados(id)
);

CREATE TABLE Telefones (
    id INT PRIMARY KEY,
    numero VARCHAR(15),
    tipo VARCHAR(255),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Clientes(id)
);

-- Inserir dados na tabela Estados
INSERT INTO Estados (id, nome, codigo) VALUES (1, 'São Paulo', 'SP');
INSERT INTO Estados (id, nome, codigo) VALUES (2, 'Rio de Janeiro', 'RJ');

-- Inserir dados na tabela Clientes
INSERT INTO Clientes (id, nome, estado_id) VALUES (1, 'Empresa A', 1);
INSERT INTO Clientes (id, nome, estado_id) VALUES (2, 'Empresa B', 2);

-- Inserir dados na tabela Telefones
INSERT INTO Telefones (id, numero, tipo, cliente_id) VALUES (1, '1143433434', 'Comercial', 1);
INSERT INTO Telefones (id, numero, tipo, cliente_id) VALUES (2, '11912345687', 'Residencial', 2);

SELECT Clientes.id AS codigo, Clientes.nome AS razao_social, Telefones.numero
FROM Clientes
JOIN Estados ON Clientes.estado_id = Estados.id
JOIN Telefones ON Clientes.id = Telefones.cliente_id
WHERE Estados.codigo = 'SP';