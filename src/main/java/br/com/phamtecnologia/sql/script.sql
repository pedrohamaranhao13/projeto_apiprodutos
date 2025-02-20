-- Inserts fornecedor
INSERT INTO tbl_fornecedor (id_pk, cnpj, nome) VALUES
  (gen_random_uuid(), '33.014.556/0001-96', 'Americanas'),
  (gen_random_uuid(), '15.436.940/0001-03', 'Amazon'),
  (gen_random_uuid(), '61.658.703/0001-75', 'Ponto Frio'),
  (gen_random_uuid(), '07.206.213/0001-58', 'Casa & Vídeo'),
  (gen_random_uuid(), '04.914.123/0001-44', 'Magazine Luiza'),
  (gen_random_uuid(), '45.987.654/0001-22', 'Carrefour'),
  (gen_random_uuid(), '12.345.678/0001-90', 'Submarino'),
  (gen_random_uuid(), '98.765.432/0001-55', 'Extra'),
  (gen_random_uuid(), '55.555.555/0001-55', 'Shoptime'),
  (gen_random_uuid(), '77.777.777/0001-77', 'Casas Bahia'),
  (gen_random_uuid(), '99.999.999/0001-99', 'Fast Shop'),
  (gen_random_uuid(), '88.888.888/0001-88', 'Lojas Americanas'),
  (gen_random_uuid(), '66.666.666/0001-66', 'Centauro'),
  (gen_random_uuid(), '22.222.222/0001-22', 'Dafiti'),
  (gen_random_uuid(), '11.111.111/0001-11', 'Kabum'),
  (gen_random_uuid(), '44.444.444/0001-44', 'Mercado Livre'),
  (gen_random_uuid(), '33.333.333/0001-33', 'Leroy Merlin'),
  (gen_random_uuid(), '20.202.020/0001-20', 'Netshoes'),
  (gen_random_uuid(), '10.101.010/0001-10', 'Havan'),
  (gen_random_uuid(), '14.141.414/0001-14', 'Renner');

  -- insert categoria
  INSERT INTO tbl_categoria (id_pk, nome) VALUES
  (gen_random_uuid(), 'Games'),
  (gen_random_uuid(), 'Eletrônicos'),
  (gen_random_uuid(), 'Móveis'),
  (gen_random_uuid(), 'Utilitários'),
  (gen_random_uuid(), 'Eletrodomésticos'),
  (gen_random_uuid(), 'Automotivo'),
  (gen_random_uuid(), 'Papelaria'),
  (gen_random_uuid(), 'Esportes'),
  (gen_random_uuid(), 'Vestuário'),
  (gen_random_uuid(), 'Beleza e Saúde');
  
  -- join
 select p.id_pk as idproduto,
p.nome,
p.preco,
p.quantidade,
p.descricao,
f.id_pk as idfornecedor,
f.nome as nomefornecedor,
f.cnpj,
c.id_pk as idcategoria,
c.nome as nomecategoria
from tbl_produto p
inner join tbl_fornecedor f on p.fornecedor_id_pk = f.id_pk
inner join tbl_categoria c on p.categoria_id_fk = c.id_pk


