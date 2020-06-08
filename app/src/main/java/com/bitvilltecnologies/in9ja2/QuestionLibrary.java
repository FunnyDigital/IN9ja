package com.bitvilltecnologies.in9ja2;

public class QuestionLibrary {



    public static String mQuestions [] = {

            "IN9JA the Fastest means of transportaion is ?",
            "What do you do IN9JA traffic ? (without earpiece)",
            "IN9ja is it wise to ? ",
            "complete the 9ja anthem 'Arise, O compatriots ",
            "In a correct 9ja home where is the  broom be kept",
            "if i hear 'PEEM' is usually said by who in  the family ",
            "i dey road the come means",
            "in 9ja 'NO Wahala means ",
            "what does 'ARE YOU MAD' in 9ja mean ?",
            "why do Nigerians say SORRY before asking for anything ",
            "every igboman is igbo, every yoruba man is a demon, every hausa man is ?",
            "in9JA Sundays are for",
            "what do you need to succeed in 9JA",
            "9ja flag has how many colours",
            "All these are normal in 9ja except ?",
            "rice and stew are traditionally for ?",
            "Native are for mostly what occasion ?",
            "Lagos is to hustlers as ABJ is to G-boys , EDO is to what ?",
            "who Born you means what is 9JA ?",
            " 'You go soon collect' , what is the person about to collect ?",
};



    private String mChioce[][]= {
            {"okada" ,"Bus" ,"foot" ,"UBER"},
            {"listen to music" ,"come down and walk " ,"complain about 9ja,it only 9ja that's your problem" ,"kuku mind your business hoo"},
            {"off touch when walking in the dark" ,"use touch when walking in the dark ","run in the dark ","blow whistle because you leave in an estate abi!" },
            {"Nigeria score obey","Nigeria's call obey","Nigeria's called To bay","Nigeria's love to bath "},
            {"Under chair","kitchen","back of door","bathroom"},
            {"father","mother","teacher","driver"},
            {"he is on his way","the guy still dey house","calling police","stuck in traffic"},
            {"No Problems","There is fire","i am angry","there is trouble"},
            {"a simple question ","issa direct insult","somthing is wrong with you","you are both mad"},
            {"because Every body is angry in this country","simple polite gesture","9ja nature","sorry starts the sentence well"},
            {"senu","mohamed","buhari","aboki"},
            {"monday prep😒","OWABE","Sleep😁","selfies"},
            {"NEPA","food","school","CONNECTION"},
            {"1(correct)","2😕","3😇","4(how?)"},
            {"dad saying i love you","milk finishing before bonvita","Shouting NEPA!","Garri doesn't need advert to sell"},
            {"weddings","freaky friday🕺🏽,","sundays","home coming"},
            {"owabe👰🏽","freaky friday","sundays","august meeting"},
            {"crafts and culture","oil investments","Airports","witchcraft"},
            {"A dare","My mother","as in the person where born you","the person that burn you 🔥"},
            {"sweet🍭","money💰","Beating","🤝 handshake"},

    };

    private String mAnswers []={

            "okada","kuku mind your business hoo","off touch when walking in the dark","Nigeria's call obey","back of door","mother",
            "the guy still dey house","No Problems","issa direct insult","because Every body is angry in this country","aboki",
            "Sleep😁","CONNECTION","3😇","dad saying i love you","sundays","owabe👰🏽","witchcraft","A dare","Beating",


    };





    public String getQuestions(int a) {
        String question=mQuestions[a];
        return question;
    }

    public String getChoise1(int a){
        String chioce0 =mChioce[a][0];
        return chioce0;
    }
    public String getChoise2(int a){
        String chioce1 =mChioce[a][1];
        return chioce1;
    }
    public String getChoise3(int a){
        String chioce2 =mChioce[a][2];
        return chioce2;
    }
    public String getChoise4(int a){
        String chioce3 =mChioce[a][3];
        return chioce3;
    }

    public String getAnswers(int a) {
        String answer = mAnswers[a];
        return answer;
    }
}
