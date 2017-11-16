CREATE TABLE `user` (
  `password` varchar(32) NOT NULL,
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1
GO


INSERT INTO `user`
(`password`,
`name`)
VALUES
('test',
'test');
GO