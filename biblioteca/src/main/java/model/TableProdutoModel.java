package model;
//src/main/java/com/biblioteca/model/TableProdutoModel.java

import javax.swing.table.AbstractTableModel;

import com.biblioteca.model.Livro;

import java.util.List;

public class TableProdutoModel extends AbstractTableModel {
 private List<Livro> produtos;
 private final String[] colunas = {"ID", "Código", "Nome", "Descrição", "Preço", "Quantidade"};

 @SuppressWarnings("unchecked")
public TableProdutoModel(Object object) {
     this.produtos = (List<Livro>) object;
 }

 @Override
 public int getRowCount() {
     return produtos.size();
 }

 @Override
 public int getColumnCount() {
     return colunas.length;
 }

 @Override
 public Object getValueAt(int rowIndex, int columnIndex) {
	 Livro livro = produtos.get(rowIndex);
     switch (columnIndex) {
         case 0: return livro.getId();
         case 1: return livro.getTitulo();
         case 2: return livro.getAutor();
         case 3: return livro.getAno();
         case 4: return livro.getNome();
         default: return null;
     }
 }

 @Override
 public String getColumnName(int column) {
     return colunas[column];
 }
 
 // Método para atualizar a lista de produtos
 public void setProdutos(List<Livro> produtos) {
     this.produtos = produtos;
     fireTableDataChanged(); // Notifica a tabela sobre a mudança de dados
 }
}
