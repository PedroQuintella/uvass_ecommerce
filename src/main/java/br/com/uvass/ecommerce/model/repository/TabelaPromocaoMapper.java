package br.com.uvass.ecommerce.model.repository;


import br.com.uvass.ecommerce.model.entity.TabelaPromocao;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TabelaPromocaoMapper implements RowMapper<TabelaPromocao> {

    @Override
    public TabelaPromocao mapRow(ResultSet resultSet, int i) throws SQLException {
        TabelaPromocao tabelaPromocao = new TabelaPromocao();
        tabelaPromocao.setId(resultSet.getInt("id"));
        tabelaPromocao.setNome(resultSet.getString("nome"));
        tabelaPromocao.setDescricao(resultSet.getString("descricao"));
        tabelaPromocao.setDataInicio(resultSet.getDate("dataInicio").toLocalDate());
        tabelaPromocao.setDataFim(resultSet.getDate("dataFim").toLocalDate());
        tabelaPromocao.setDataCadastro(resultSet.getDate("dataCadastro").toLocalDate());
        tabelaPromocao.setDataUltimaAtualizacao(resultSet.getTimestamp("dataUltimaAtualizacao"));
        return tabelaPromocao;
    }
}
