package pageObjects;


    public enum Massengers {
        TELEGRAM("tg"), VIBER("vb");
        final String dataName;

        public String getDataName() {
            return dataName;
        }

        Massengers(String tg) {
            dataName = tg;
        }
    }

