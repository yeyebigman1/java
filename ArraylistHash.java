Data
"^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(\\d{4})$"

Hora
"^([01]?[0-9]|2[0-3]):[0-5][0-9]$"

ForEach

    pacient.forEach((key, value) -> {
            System.out.print("Key " + key);
            System.out.println("Value" + value.get(0));

        });

Mostrar LocalDateTime castejat

    pacient.forEach((key, value) -> {
            System.out.print("Targeta Sanitaria: " + key);
            System.out.println("  Nom: " + value.get(0) + " Cognoms: " + value.get(1) + " Data i hora de visita: "
                    + ((LocalDateTime) value.get(2)).getYear() + "/" + ((LocalDateTime) value.get(2)).getMonthValue()
                    + "/" + ((LocalDateTime) value.get(2)).getDayOfMonth() + " "
                    + ((LocalDateTime) value.get(2)).getHour() + ":" + ((LocalDateTime) value.get(2)).getMinute());

        });

Declarar Treep
TreeMap<String, ArrayList<Object>> pacient = new TreeMap<String, ArrayList<Object>>();

TreeMap<String, TreeMap<Integer, ArrayList<Object>>> metges = new TreeMap<String, TreeMap<Integer, ArrayList<Object>>>();


Declarar Hasmap

Map<Integer, ArrayList<Object>> stock = new HashMap<>();


Temps de diferencia
    public static String mostraHoraITempsDeQuiHaArribat(LocalTime ltStart, LocalTime ltArribada) {

        System.out.println("Temps d'arribada " + "Hora: " + ltArribada.getHour() + "Minuts: " + ltArribada.getMinute()
                + "Segons: " + ltArribada.getSecond());


        long lt = ltArribada.toSecondOfDay();
        long lp = ltStart.toSecondOfDay();
        long resultat = lt-lp;
        LocalTime ltfinal = LocalTime.ofSecondOfDay(resultat);
        System.out.println("Temps final: " + ltfinal.getHour() + ltfinal.getMinute() + ltfinal.getSecond());

        return ltfinal.toString();
    }

}

equip.forEach((key, value) -> {
            System.out.println("Equip: " + key);
            value.forEach((k, v) -> {
                System.out.println("Dorsal: " + k + " - Nom: " + v.get(0) + " - Punts: " + v.get(1));

            });

        });
