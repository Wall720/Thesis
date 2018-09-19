package com.example.wall720.quiz6siege;


public class Questions {

    public String mQuestions[] = {
            "Melyik operátor vakítja meg ellenfeleit",
            "Melyik operátor rendelkezik 'Silent Step' képességgel",
            "Melyik operátor tehet ablakot a megerősitett falra",
            "melyik operátor eszköze lát a falon át eszközöket",
            "Melyik operátor használ mérgező füstöt",
            "Melyik operátor tudja zavarni a készülékeket",
            "Melyik operátor tud megerősitett barikádot elhelyezni",
            "Melyik pálya található Spanyolországban",
            "Melyik pálya található Amerikában",
            "Melyik pálya található Japánban",
            "Melyik operátor rendelkezik 'Yokai Drone' képességel",
            "Melyik operátor rendelkezik 'Concussion Mine' képességel",
            "Melyik operátor rendelkezik 'Dart' képességel",
            "Melyik operátor rendelkezik 'Stim pistol' képességel",
            "Melyik operátor tud lőni a drónnal",
            "Melyik operátor látja a lábnyomokat",
            "Melyik operátor használ kalapácsot",




    };

    private String mChoices[][] = {
            {"Fuze","Blitz","Montagne","Blackbeard"},
            {"Bandit","Jager","Pulse","Caveira"},
            {"Ela","Tachanka","Mira","Kapkan"},
            {"IQ","Twitch","Buck","Thermite"},
            {"Smoke","Glaz","Thermite","Blitz"},
            {"Tatcher","IQ","Mute","Lion"},
            {"Pulse","Valkyrie","Ela","Castle"},
            {"Hereford Base","Coastline","Bank","Oregon"},
            {"Skyscraper","House","Consulate","Bank"},
            {"House","Skyscraper","Bank","Coastline"},
            {"Jager","Bandit","Mira","Echo"},
            {"Ela","Kapkan","Doc","Rook"},
            {"Montagne","Thermite","Capitao","Blackbeard"},
            {"Pulse","Frost","Rook","Doc"},
            {"Kapkan","Glaz","Mira","Twitch"},
            {"Jackal","IQ","Blitz","Thermite"},
            {"Glaz","Thermite","Sledge","Doc"},
    };

    private String mCorrectAnswers []= {
            "Blitz",
            "Caveira",
            "Mira",
            "IQ",
            "Smoke",
            "Mute",
            "Castle",
            "Coastline",
            "Consulate",
            "Skyscraper",
            "Echo",
            "Ela",
            "Capitao",
            "Doc",
            "Twitch",
            "Jackal",
            "Sledge",

    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswers(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}

