INSERT INTO CLIENTE (CPF_CLIENTE, NOME_CLIENTE, TELEFONE_CLIENTE, EMAIL_CLIENTE, DATA_NASCIMENTO_CLIENTE, SENHA_CLIENTE) VALUES
('12345678901', 'João Silva', '999999999', 'joao.silva@example.com', '1990-01-01', 'senha123'),
('98765432109', 'Maria Souza', '888888888', 'maria.souza@example.com', '1995-05-10', 'senha456'),
('45678912307', 'Pedro Santos', '777777777', 'pedro.santos@example.com', '1985-12-15', 'senha789'),
('32165498705', 'Ana Oliveira', '666666666', 'ana.oliveira@example.com', '1998-08-20', 'senha321'),
('78945612303', 'Luiza Rodrigues', '555555555', 'luiza.rodrigues@example.com', '1992-03-25', 'senha654');

INSERT INTO FUNCIONARIO (MATRICULA_FUNCIONARIO, NOME_FUNCIONARIO, TELEFONE_FUNCIONARIO, EMAIL_FUNCIONARIO) VALUES
(123456, 'João Silva', '(11) 98765-4321', 'joao.silva@example.com'),
(234567, 'Maria Santos', '(11) 91234-5678', 'maria.santos@example.com'),
(345678, 'Pedro Oliveira', '(11) 92345-6789', 'pedro.oliveira@example.com'),
(456789, 'Ana Rodrigues', '(11) 93456-7890', 'ana.rodrigues@example.com'),
(567890, 'Carlos Ferreira', '(11) 94567-8901', 'carlos.ferreira@example.com');

INSERT INTO ENDERECO (CEP_ENDERECO_IMOVEL, LOGRADOURO_ENDERECO_IMOVEL, NUMERO_ENDERECO_IMOVEL, COMPLEMENTO_ENDERECO_IMOVEL, BAIRRO_ENDERECO_IMOVEL, CIDADE_ENDERECO_IMOVEL, UF_ENDERECO_IMOVEL) VALUES
('12345-678', 'Rua A', '100', 'Apto 101', 'Centro', 'São Paulo', 'SP'),
('98765-432', 'Avenida B', '500', 'Casa 2', 'Jardins', 'Rio de Janeiro', 'RJ'),
('45678-912', 'Rua C', '200', null, 'Barra Funda', 'São Paulo', 'SP'),
('32165-498', 'Avenida D', '1000', 'Casa 1', 'Copacabana', 'Rio de Janeiro', 'RJ'),
('78945-612', 'Rua E', '300', null, 'Centro', 'São Paulo', 'SP');

INSERT INTO IMOVEL (STATUS_IMOVEL, VALOR_COMPRA_IMOVEL, VALOR_ALUGUEL_IMOVEL, PERMUTA_IMOVEL, ACEITA_ANIMAIS_IMOVEL, TIPO_IMOVEL, FINALIDADE_IMOVEL, AREA_IMOVEL, AREA_CONSTRUIDA_IMOVEL, ID_FUNCIONARIO, ID_CLIENTE, ID_ENDERECO_IMOVEL) VALUES
(true, 250000.0, 1500.0, false, true, 'Casa', 'V', 300.0, 250.0, 1, 1, 1),
(true, 350000.0, 2000.0, false, true, 'Apartamento', 'V', 120.0, 100.0, 2, 2, 2),
(true, 400000.0, 1800.0, true, true, 'Casa', 'V', 400.0, 350.0, 3, 3, 3),
(true, 180000.0, 1000.0, false, false, 'Apartamento', 'L', 80.0, 75.0, 4, 4, 4),
(true, 500000.0, 2200.0, false, true, 'Casa', 'V', 350.0, 300.0, 5, 5, 5);

INSERT INTO DEPENDENCIA (NOME_DEPENDENCIA_IMOVEL, TIPO_DEPENDENCIA_IMOVEL, AREA_DEPENDENCIA_IMOVEL, MOBILIA_DEPENDENCIA_IMOVEL, ID_IMOVEL) VALUES
('Quarto', 'Quarto', 15.5, true, 1),
('Sala', 'Sala de Estar', 25.2, false, 1),
('Banheiro', 'Banheiro', 8.7, true, 2),
('Cozinha', 'Cozinha', 18.3, true, 2),
('Garagem', 'Garagem', 30.0, false, 3);

INSERT INTO MANUTENCAO (DATA_MANUTENCAO_IMOVEL, TIPO_MANUTENCAO_IMOVEL, RESPONSAVEL_MANUTENCAO_IMOVEL, CUSTO_MANUTENCAO_IMOVEL, OBSERVACOES_MANUTENCAO_IMOVEL, ID_IMOVEL) VALUES
('2023-01-05', 'Elétrica', 'João', 500.0, 'Troca de fiação', 1),
('2023-02-15', 'Hidráulica', 'Pedro', 300.0, 'Conserto de vazamento', 1),
('2023-03-20', 'Pintura', 'Maria', 800.0, 'Pintura interna e externa', 2),
('2023-04-10', 'Limpeza', 'Ana', 200.0, 'Limpeza geral', 2),
('2023-05-25', 'Jardinagem', 'Luiz', 400.0, 'Corte de grama', 3);

