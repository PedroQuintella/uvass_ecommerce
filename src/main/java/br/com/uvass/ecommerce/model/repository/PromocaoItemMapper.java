package br.com.uvass.ecommerce.model.repository;

import br.com.uvass.ecommerce.model.entity.PromocaoItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromocaoItemMapper implements RowMapper<PromocaoItem> {

    @Override
    public PromocaoItem mapRow(ResultSet resultSet, int i) throws SQLException {
        PromocaoItem promocaoItem = new PromocaoItem();
        promocaoItem.setId(resultSet.getInt("id"));
        promocaoItem.setValorPromocao(resultSet.getFloat("valorPromocao"));
        promocaoItem.setDataCadastro(resultSet.getDate("dataCadastro").toLocalDate());
        promocaoItem.setDataUltimaAtualizacao(resultSet.getTimestamp("dataUltimaAtualizacao"));
        promocaoItem.setId_tabelaPromocao((resultSet.getInt("id_tabelaPromocao")));
        promocaoItem.setId_produto(resultSet.getInt("id_produto"));

        return promocaoItem;
    }
}