INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'https://png.pngtree.com/png-clipart/20190516/original/pngtree-tv-icon-png-image_3568215.jpg', 'Televisoes', 'TVs diversas');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'TVSamsung', 'TV LED da Samsung', 'https://images.samsung.com/is/image/samsung/br-uhd-tu7000-un50tu7000gxzd-Titan-Gray-1--246680995?$720_576_PNG$', '2021-12-20', CURRENT_TIMESTAMP(), '2000.00');

INSERT INTO categoriaProduto(id, id_categoria, id_produto)
VALUES (1, 1, 1);

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'Black Friday', 'Promoção de Black Friday', '2021-11-01', '2021-12-01', '2021-10-25', CURRENT_TIMESTAMP());

INSERT INTO promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, id_tabelaPromocao, id_produto)
VALUES (1, 1600.00, '2021-10-25', CURRENT_TIMESTAMP(), 1, 1);