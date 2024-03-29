CREATE TABLE categoria(
                     id                     INT NOT NULL,
                     imagemSimboloUrl       VARCHAR(500),
                     nome                   VARCHAR(100) NOT NULL,
                     descricao              VARCHAR(150) NOT NULL
);

CREATE TABLE produto(
                     id                     INT NOT NULL,
                     nome                   VARCHAR(100) NOT NULL,
                     descricao              VARCHAR(150) NOT NULL,
                     fotoUrl                VARCHAR(500),
                     dataCadastro           DATE NOT NULL,
                     dataUltimaAtualizacao  TIMESTAMP NOT NULL,
                     valorUnitario          FLOAT NOT NULL
);

CREATE TABLE categoriaProduto(
                     id                     INT NOT NULL,
                     id_categoria           INT NOT NULL,
                     id_produto             INT NOT NULL,
                     FOREIGN KEY (id_categoria) REFERENCES categoria(id),
                     FOREIGN KEY (id_produto) REFERENCES produto(id)
);

CREATE TABLE tabelaPromocao(
                     id                     INT NOT NULL,
                     nome                   VARCHAR(100) NOT NULL,
                     descricao              VARCHAR(150) NOT NULL,
                     dataInicio             DATE NOT NULL,
                     dataFim                DATE NOT NULL,
                     dataCadastro           DATE NOT NULL,
                     dataUltimaAtualizacao  TIMESTAMP NOT NULL
);

CREATE TABLE promocaoItem(
                     id                     INT NOT NULL,
                     valorPromocao          FLOAT NOT NULL,
                     dataCadastro           DATE NOT NULL,
                     dataUltimaAtualizacao  TIMESTAMP NOT NULL,
                     id_tabelaPromocao      INT NOT NULL,
                     id_produto             INT NOT NULL,
                     FOREIGN KEY (id_tabelaPromocao) REFERENCES tabelaPromocao(id),
                     FOREIGN KEY (id_produto) REFERENCES produto(id)
);