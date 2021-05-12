INSERT INTO t_groupselected (id_student, firstname, lastname, groupid)
SELECT t.id_student, t.firstname, t.lastname, t.groupid FROM t_student t
WHERE t.groupId = '123' AND t.dolgCount > 5
