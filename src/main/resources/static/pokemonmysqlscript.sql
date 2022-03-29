CREATE TABLE `pokemon` (
                           `pokedex_number` int NOT NULL,
                           `name` varchar(45) DEFAULT NULL,
                           `speed` int DEFAULT NULL,
                           `special_defence` int DEFAULT NULL,
                           `special_attack` int DEFAULT NULL,
                           `defence` int DEFAULT NULL,
                           `attack` int DEFAULT NULL,
                           `hp` int DEFAULT NULL,
                           `primary_type` varchar(45) DEFAULT NULL,
                           `secondary_type` varchar(45) DEFAULT NULL,
                           PRIMARY KEY (`pokedex_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci