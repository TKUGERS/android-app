package com.example.tkugers.ratingpage

private var courseCode = mapOf(
    // 人文領域, 文學經典學門(L)
    Pair("希臘羅馬神話", "A0377"),
    Pair("文學名篇選讀：愛戀與生活", "A2928"),
    Pair("文學名篇選讀：群己與生命", "A2929"),
    Pair("台灣文學選讀", "A2930"),
    Pair("科幻小說選讀", "A2931"),
    Pair("當代英美文學經典", "A2932"),
    Pair("日本文學中譯賞析", "F0807"),
    Pair("聖經文學入門", "F0808"),
    Pair("日本現代小說與電影", "F0810"),
    Pair("西班牙語文學經典賞析", "F1134"),
    Pair("德語文學名著選讀（一）", "F1135"),
    Pair("德語文學名著選讀（二）", "F1138"),
    Pair("俄國文學經典入門", "F1136"),
    Pair("法國文學、生活與文化", "F1137"),
    Pair("法國經典文學導讀", "F1139"),
    Pair("西班牙語國家文學名著賞析", "F1140"),
    Pair("村上春樹講座", "F1147"),
    // 人文領域, 歷史與文化學門(P)
    Pair("歐洲文化史", "A1813"),
    Pair("中國歷史文物賞析", "A2020"),
    Pair("中國歷史文物賞析", "A2062"),
    Pair("近代史事叢譚", "A2368"),
    Pair("西洋歷史與人物", "A2505"),
    Pair("台灣歷史采風與踏查", "A3454"),
    Pair("台灣海洋歷史與文化", "T2972"),
    // 人文領域, 哲學與宗教學門(V)
    Pair("倫理學", "T0099"),
    Pair("哲學概論", "T0100"),
    Pair("醫學倫理", "T0170"),
    Pair("哲學經典導讀", "T0338"),
    Pair("宗教概論", "T0339"),
    Pair("宗教經典導讀", "T0340"),
    Pair("生死學", "T0348"),
    Pair("環境倫理", "T1238"),
    Pair("職業倫理", "T1810"),
    Pair("性愛的文學與哲學", "T2005"),
    Pair("女性主義", "T2575"),
    Pair("邏輯與哲學", "T2917"),
    Pair("性學與哲學", "T2918"),
    Pair("美學－理論與實務", "T2919"),
    Pair("台灣宗教", "T2971"),
    Pair("性別理論與實踐", "T3054"),
    // 人文領域, 藝術欣賞與創作學門(M)
    Pair("表演藝術", "A0457"),
    Pair("音樂概論", "A0544"),
    Pair("臺灣劇場講座", "A2938"),
    Pair("數位藝術內容發展", "T0334"),
    Pair("數位藝術概論", "T0336"),
    Pair("世界名曲賞析與詮釋", "T1287"),
    Pair("西洋歌劇欣賞入門", "T2013"),
    Pair("書法藝術的應用", "T2014"),
    Pair("造型藝術中的基礎素描技法", "T2016"),
    Pair("鋼琴藝術與生活", "T2104"),
    Pair("音樂與藝術的對話", "T2105"),
    Pair("藝術與人生－與大師對話", "T2657"),
    Pair("身體語言與舞蹈藝術", "T2916"),
    Pair("從文本到舞台－讀劇概論", "T3050"),
    Pair("歐洲文化藝術行旅", "T3051"),
    Pair("新媒體藝術概論", "T3052"),
    // 社會領域, 全球視野學門(T)
    Pair("國際規範與禮儀", "H0002"),
    Pair("大三留學實務管理（一）", "P0038"),
    Pair("大三留學實務管理（二）", "P0039"),
    Pair("大三留學實務管理（三）", "P0040"),
    Pair("大三留學實務管理（四）", "P0041"),
    Pair("世界人權問題", "T0536"),
    Pair("全球化發展", "T0537"),
    Pair("國際現勢", "T0831"),
    Pair("世界環境保護", "T0833"),
    Pair("歐洲聯盟與歐洲統合", "T0834"),
    Pair("文化全球化", "T0835"),
    Pair("東亞與世界", "T0837"),
    Pair("全球體系與兩岸關係", "T0838"),
    Pair("經濟全球化", "T0839"),
    Pair("美洲現勢", "T0840"),
    Pair("國際非政府組織", "T0841"),
    Pair("莫內講座：歐洲聯盟與歐洲統合", "T2989"),
    Pair("莫內模組：歐洲聯盟與歐洲統合", "T2899"),
    Pair("台灣戰略地位", "T2943"),
    // 社會領域, 未來學學門(R)
    Pair("環境未來", "T0176"),
    Pair("經濟未來", "T1178"),
    Pair("社會未來", "T1179"),
    Pair("科技未來", "T1180"),
    Pair("政治未來", "T1208"),
    Pair("社會未來－城市未來", "T2941"),
    Pair("社會未來－運動文化趨勢", "T2942"),
    Pair("經濟未來－長壽趨勢與高齡經濟", "T3024"),
    // 社會領域, 社會分析學門(W)
    Pair("台灣社會與文化", "A1493"),
    Pair("人際關係與溝通", "A1636"),
    Pair("經濟學概論", "A1970"),
    Pair("正向心理學", "D0425"),
    Pair("社會心理學", "T0066"),
    Pair("文化與心理健康", "T0161"),
    Pair("人權與社會正義", "T0169"),
    Pair("媒體與傳播文化", "T0189"),
    Pair("社會變遷與社會教育", "T0350"),
    Pair("性別角色與性屬關係", "T0351"),
    Pair("戰爭與人性", "T0829"),
    Pair("幸福經濟學", "T0830"),
    Pair("傳統社會與社會變遷", "T1215"),
    Pair("發展心理學概論", "T1594"),
    Pair("心理學導論", "T1822"),
    Pair("社會學導論", "T1832"),
    Pair("政治學概論", "T1891"),
    Pair("生活與財經", "T2882"),
    Pair("生活中的行銷", "T2940"),
    Pair("性別與社會", "T2944"),
    Pair("幸福經濟學－理性與感性", "T2992"),
    Pair("幸福的理性與感性", "T3047"),
    Pair("政治心理學", "T3048"),
    Pair("數位環境與媒體新素養", "T3049"),
    // 社會領域, 公民社會及參與學門(S)
    Pair("非營利組織", "M1179"),
    Pair("社會企業", "M2301"),
    Pair("企業與法律", "T0805"),
    Pair("生活與法律", "T0806"),
    Pair("民主政治", "T0808"),
    Pair("公民社會", "T0809"),
    Pair("公民參與", "T0811"),
    Pair("民主政治", "T0813"),
    Pair("公民文化", "T0813"),
    Pair("憲法與人權", "T2207"),
    Pair("資訊生活與法律", "T2211"),
    Pair("智慧財產權與法律", "T2610"),
    // 科學領域, 資訊教育學門(O)
    Pair("資訊概論", "E1034"),
    Pair("電腦入門與應用", "E3527"),
    Pair("網路與資訊科技", "E3528"),
    Pair("OFFICE證照實務", "E3529"),
    Pair("網路與雲端應用", "E3530"),
    Pair("多媒體實務與應用", "E3531"),
    Pair("智慧型手機程式設計", "E3739"),
    Pair("iOS 程式開發", "E3742"),
    Pair("iOS 應用程式開發", "E3750"),
    Pair("進階C語言應用", "E3847"),
    Pair("PYTHON程式語言", "E3861"),
    Pair("電腦入門與程式思維", "E3862"),
    Pair("MOS證照實務", "P0079"),
    Pair("網頁程式設計", "T0205"),
    // 科學領域, 全球科技革命學門(Z)
    Pair("生物科技", "E2523"),
    Pair("機械簡史", "E3628"),
    Pair("全球科技革命", "H0003"),
    Pair("地球生態環境", "S0920"),
    Pair("能源與材料科技", "S0922"),
    Pair("電子與電腦科技", "S0923"),
    Pair("海洋科技", "S0924"),
    Pair("科技永續", "S0925"),
    Pair("智慧綠生活", "S0926"),
    Pair("科技進化", "S0927"),
    Pair("智慧機器人", "S0928"),
    // 科學領域, 自然科學學門(U)
    Pair("生活邏輯", "S0353"),
    Pair("物理與生活", "S0358"),
    Pair("宇宙的探索", "S0362"),
    Pair("化學與生活：化學、環境與社會", "S0368"),
    Pair("化學與生活：化學、醫藥與社會", "S0369"),
    Pair("生命科學：人體的奧秘", "S0377"),
    Pair("生命科學：基因科技與健康", "S0690"),
    Pair("光、攝影和視覺", "S0727"),
    Pair("生活中的化學", "S0738"),
    Pair("數學漫遊", "S0747"),
    Pair("科技的原理", "S0748"),
    Pair("半導體與生活", "S0749"),
    Pair("生命科學：DNA科技時代", "S0751"),
    Pair("性別中的科學", "S1024"),
    Pair("性別與科學", "S1025"),
    Pair("科學之旅", "T2166"),
    Pair("化學與生活：化學、食品與社會", "T2167"),
    Pair("統計與生活", "T2973")
)

private var codeInstructor = mapOf(
    // 人文領域, 文學經典學門(L)
    Pair("A0377", "劉曉薇"),
    Pair("A2928", "謝旻琪...等"),
    Pair("A2929", "周君璞...等"),
    Pair("A2930", "侯如綺"),
    Pair("A2931", "林黛嫚"),
    Pair("A2932", "羅艾琳"),
    Pair("F0807", "顧錦芬"),
    Pair("F0808", "劉曉薇"),
    Pair("F0810", "顧錦芬"),
    Pair("F1134", "林盛彬"),
    Pair("F1135", "林郁嫺"),
    Pair("F1138", "林郁嫺"),
    Pair("F1136", "龔信賢"),
    Pair("F1137", "廖潤珮"),
    Pair("F1139", "謝淳清"),
    Pair("F1140", "林盛彬"),
    Pair("F1147", "曾秋桂"),
    // 人文領域, 歷史與文化學門(P)
    Pair("A1813", "劉增泉"),
    Pair("A2020", "古怡青...等"),
    Pair("A2062", "王樾...等"),
    Pair("A2368", "羅運治"),
    Pair("A2505", "唐耀棕...等"),
    Pair("A3454", "袁明道...等"),
    Pair("T2972", "陳鈺祥"),
    // 人文領域, 哲學與宗教學門(V)
    Pair("T0099", "王靈康"),
    Pair("T0100", "王志銘...等"),
    Pair("T0170", "徐佐銘"),
    Pair("T0338", "蘇富芝...等"),
    Pair("T0339", "唐耀棕...等"),
    Pair("T0340", "李峰銘"),
    Pair("T0348", "鄭鈞瑋...等"),
    Pair("T1238", "程進發"),
    Pair("T1810", "王靈康"),
    Pair("T2005", "徐佐銘"),
    Pair("T2575", "王蔚婷...等"),
    Pair("T2917", "許樹和...等"),
    Pair("T2918", "胡延薇...等"),
    Pair("T2919", "王志銘...等"),
    Pair("T2971", "陳杏枝"),
    Pair("T3054", "劉亞蘭"),
    // 人文領域, 藝術欣賞與創作學門(M)
    Pair("A0457", "吳文琪...等"),
    Pair("A0544", "干詠穎"),
    Pair("A2938", "陳慧勻"),
    Pair("T0334", "謝朝鐘"),
    Pair("T0336", "柯建恩...等"),
    Pair("T1287", "林鄉雨...等"),
    Pair("T2013", "王淑堯...等"),
    Pair("T2014", "張炳煌"),
    Pair("T2016", "戴佳茹"),
    Pair("T2104", "李珮瑜"),
    Pair("T2105", "李珮瑜...等"),
    Pair("T2657", "戴佳茹"),
    Pair("T2916", "吳文琪"),
    Pair("T3050", "陳慧勻"),
    Pair("T3051", "戴佳茹"),
    Pair("T3052", "林俊賢"),
    // 社會領域, 全球視野學門(T)
    Pair("H0002", "綠軒亞...等"),
    Pair("P0038", "梁家恩...等"),
    Pair("P0039", "周志偉...等"),
    Pair("P0040", "林偉修...等"),
    Pair("P0041", "林偉修...等"),
    Pair("T0536", "林立"),
    Pair("T0537", "郭秋慶"),
    Pair("T0831", "施正權...等"),
    Pair("T0833", "苑倚曼"),
    Pair("T0834", "張福昌"),
    Pair("T0835", "崔琳...等"),
    Pair("T0837", "徐浤馨"),
    Pair("T0838", "翁明賢...等"),
    Pair("T0839", "陳逸青...等"),
    Pair("T0840", "黃富娟...等"),
    Pair("T0841", "游雅雯...等"),
    Pair("T2989", "陳麗娟"),
    Pair("T2899", "卓忠宏"),
    Pair("T2943", "黃介正"),
    // 社會領域, 未來學學門(R)
    Pair("T0176", "陳建甫...等"),
    Pair("T1178", "王貞靜...等"),
    Pair("T1179", "李長潔...等"),
    Pair("T1180", "范素玲...等"),
    Pair("T1208", "周湘華...等"),
    Pair("T2941", "鄧建邦"),
    Pair("T2942", "紀舜傑"),
    Pair("T3024", "鄧玉英"),
    // 社會領域, 社會分析學門(W)
    Pair("A1493", "陳杏枝"),
    Pair("A1636", "胡延薇"),
    Pair("A1970", "鄧玉英"),
    Pair("D0425", "宋鴻燕"),
    Pair("T0066", "韓貴香"),
    Pair("T0161", "宋鴻燕...等"),
    Pair("T0169", "黃奕琳"),
    Pair("T0189", "藍毓華...等"),
    Pair("T0350", "藍毓華"),
    Pair("T0351", "彭莉惠"),
    Pair("T0829", "黃文智"),
    Pair("T0830", "鄧玉英"),
    Pair("T1215", "藍毓華"),
    Pair("T1594", "宋鴻燕...等"),
    Pair("T1822", "胡延薇...等"),
    Pair("T1832", "鄧建邦...等"),
    Pair("T1891", "黃奕琳"),
    Pair("T2882", "曾慧敏...等"),
    Pair("T2940", "陳水蓮"),
    Pair("T2944", "林怡君"),
    Pair("T2992", "干詠穎...等"),
    Pair("T3047", "韓貴香...等"),
    Pair("T3048", "宋鴻燕...等"),
    Pair("T3049", "藍毓華"),
    // 社會領域, 公民社會及參與學門(S)
    Pair("M1179", "張景台...等"),
    Pair("M2301", "詹立煒...等"),
    Pair("T0805", "呂其昌...等"),
    Pair("T0806", "許昭元...等"),
    Pair("T0808", "黃琛瑜...等"),
    Pair("T0809", "周應龍...等"),
    Pair("T0811", "戴政龍...等"),
    Pair("T0813", "安娜...等"),
    Pair("T0813", "何景榮...等"),
    Pair("T2207", "謝相慶...等"),
    Pair("T2211", "陳銘祥"),
    Pair("T2610", "王琇慧...等"),
    // 科學領域, 資訊教育學門(O)
    Pair("E1034", "洪復一...等"),
    Pair("E3527", "翁孟廷...等"),
    Pair("E3528", "鄭建富...等"),
    Pair("E3529", "陳智揚...等"),
    Pair("E3530", "林國賡...等"),
    Pair("E3531", "陳德展...等"),
    Pair("E3739", "林潮文...等"),
    Pair("E3742", "陳俊豪"),
    Pair("E3750", "林其誼...等"),
    Pair("E3847", "陳瑞發...等"),
    Pair("E3861", "游國忠...等"),
    Pair("E3862", "王駿瑋...等"),
    Pair("P0079", "武士戎"),
    Pair("T0205", "鄭國祥...等"),
    // 科學領域, 全球科技革命學門(Z)
    Pair("E2523", "陳銘凱...等"),
    Pair("E3628", "楊龍杰"),
    Pair("H0003", "陳惇凱...等"),
    Pair("S0920", "黃富國...等"),
    Pair("S0922", "王儀雯...等"),
    Pair("S0923", "何金新...等"),
    Pair("S0924", "楊龍杰"),
    Pair("S0925", "高思懷...等"),
    Pair("S0926", "李安瑞...等"),
    Pair("S0927", "吳國暉...等"),
    Pair("S0928", "吳乾埼...等"),
    // 科學領域, 自然科學學門(U)
    Pair("S0353", "曾琇瑱"),
    Pair("S0358", "洪振湧...等"),
    Pair("S0362", "秦一男...等"),
    Pair("S0368", "鄧金培...等"),
    Pair("S0369", "鄭鈞霆...等"),
    Pair("S0377", "陳銘凱"),
    Pair("S0690", "王芸馨...等"),
    Pair("S0727", "林震安...等"),
    Pair("S0738", "謝忠宏...等"),
    Pair("S0747", "潘志實...等"),
    Pair("S0748", "李明憲"),
    Pair("S0749", "鄭振益...等"),
    Pair("S0751", "莊子超"),
    Pair("S1024", "朱惠芳"),
    Pair("S1025", "李明憲"),
    Pair("T2166", "陳旭...等"),
    Pair("T2167", "王三郎...等"),
    Pair("T2973", "陳順益...等")
)

fun course2code (course_name: String): String {
    if (courseCode[course_name] != null) {
        return courseCode[course_name].toString()
    }
    return ""
}

fun code2course (course_code: String): String {
    return courseCode.filterValues { it == course_code }.keys.first()
}

fun code2instructor (course_code: String): String {
    if (codeInstructor[course_code] != null) {
        return codeInstructor[course_code].toString()
    }
    return ""
}

fun instructor2code (course_code: String): String {
    val res = codeInstructor.filterValues { it == course_code }.keys.first()
    if(res != null) {
        return res
    }
    return ""
}

fun course2instructor (course_name: String): String {
    val code = course2code(course_name)
    if(code != null) {
        return code2instructor(code)
    }
    return ""
}

fun instructor2course (instructor_name: String): String {
    val code = instructor2code(instructor_name)
    return code2course(code)
}