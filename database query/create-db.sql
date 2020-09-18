CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `empId` int NOT NULL,
  `dateOfJoining` date NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `designation` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `proj1`.`user`
(`id`,
`name`,
`empId`,
`dateOfJoining`,
`email`,
`password`,
`designation`)
VALUES
(<{id: }>,
<{name: }>,
<{empId: }>,
<{dateOfJoining: }>,
<{email: }>,
<{password: }>,
<{designation: }>);
