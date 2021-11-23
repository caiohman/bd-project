-- Listar todos as pessoas ficha limpa, isto é, que podem ser candidatas
-- Devido ao trigger utilizado para atualizar o atributo fichaLimpa, esta consulta está simplificada
SELECT * FROM individuos I
WHERE(I.fichaLimpa = TRUE);

--  Geração de relatório de candidaturas, indicando quais são os candidatos eleitos, inclusive os vices quando for o caso
SELECT CG.nome, C.ano, I.nome, CA.vicecandidato, C.qtdvotos FROM candidaturas C
	INNER JOIN cargos CG ON C.cargo = CG.idCargo
	INNER JOIN candidatos CA ON C.candidato = CA.cpf
	INNER JOIN individuos I ON CA.cpf = I.cpf
GROUP BY CG.nome, C.ano, C.qtdvotos, I.nome, CA.vicecandidato
ORDER BY CG.nome, C.ano, C.qtdvotos, I.nome, CA.vicecandidato;

