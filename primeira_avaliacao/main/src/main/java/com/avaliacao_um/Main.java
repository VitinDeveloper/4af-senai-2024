package com.avaliacao_um;

import java.time.LocalDateTime;

public class Main {

        public static void main(String[] args) {

                // Criando um usuário
                User user = new User("Teste", "Testando", "teste@mail.com", "teste123");

                // Criando um líder da equipe
                Leader leader = new Leader(true, "Team Bomb");

                // Criando um endereço de parque
                ParkAddress parkAddress = new ParkAddress("Floripa", "SC", "BR", "Rio Vermelho", -27.5, -48.42);

                // Criando uma equipe de combate
                User[] members = { user };
                CombatTeam combatTeam = new CombatTeam(2, leader, members, parkAddress);

                // Criando uma imagem
                Image image = new Image("link", "2023-08-26T12:18:20.574704", "");

                // Criando um sensor
                Sensor sensor = new Sensor(-27.5, -48.42, Sensor.SensorStatus.OPERATIONAL, "Temperatura Sensor");

                // Criando uma leitura de sensor
                SensorRead sensorRead = new SensorRead(22.4f, LocalDateTime.parse("2023-08-26T12:18:20.577212"),
                                sensor);

                // Criando um foco de incêndio
                FireSpot fireSpot = new FireSpot(
                                "2023-08-26T12:18:20.578186",
                                "2023-08-26T12:18:20.578225",
                                "Indefinido",
                                FireSpot.Status.EXTINCT,
                                FireSpot.Identification.SATELLITE,
                                FireSpot.Intensity.LOW,
                                leader,
                                parkAddress,
                                new Image[] { image },
                                null
                );

                // Exibindo os dados no terminal
                System.out.println(user);
                System.out.println(leader);
                System.out.println(parkAddress);
                System.out.println(combatTeam);
                System.out.println(image);
                System.out.println(sensor);
                System.out.println(sensorRead);
                System.out.println(fireSpot);
        }
}
