INSERT INTO pacientes (id,numero_socio,contraseña,nombre_usuario,nombre_completo,dni,nombre_obra_social) VALUES (2,273,'conguito','FSpini1','franco spini',33242111,'mapaci');
INSERT INTO pacientes (id,numero_socio,contraseña,nombre_usuario,nombre_completo,dni,nombre_obra_social) VALUES (1,166,'Cachilo5','NRomero','noelia romero',14412125,'italmedic');
INSERT INTO pacientes (id,numero_socio,contraseña,nombre_usuario,nombre_completo,dni,nombre_obra_social) VALUES (3,628,'FranZappa2','AVillar','arturo villar',83344671,'unr salud');
INSERT INTO medicos (id,nombre_completo,matricula,especialidad) VALUES (1,'Diego Torres',2233,'kinesiologia');
INSERT INTO medicos (id,nombre_completo,matricula,especialidad) VALUES (2,'Horacio Minetti',224151,'oftalmologia');
INSERT INTO medicos (id,nombre_completo,matricula,especialidad) VALUES (3,'Carla Fildkerchirc',44227,'odontologia');
INSERT INTO turnos (id,fecha_turno,hora_turno,id_paciente,id_medico) VALUES (7,'2025-07-01','16:14:03',1,2);
INSERT INTO turnos (id,fecha_turno,hora_turno,id_paciente,id_medico) VALUES (8,'2025-09-10','19:40:13',2,3);