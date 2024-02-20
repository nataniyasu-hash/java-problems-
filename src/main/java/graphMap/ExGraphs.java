package graphMap;

import graphMap.map.MapGraph;

import static list.List.list;
import static tuple.Tuple.tuple;

public class ExGraphs {

  static Graph<String,Integer> gradle =
          MapGraph.fromList(list(tuple(tuple("1","2"),0),
                        tuple(tuple("1","3"),0),
                        tuple(tuple("1","4"),0),
                        tuple(tuple("2","3"),0),
                        tuple(tuple("3","4"),0)));

  // Graph von RL S.141
  public static Graph<String,Integer> gRL141 =
          MapGraph.fromList(list(tuple(tuple("1","2"),0),
                  tuple(tuple("1","3"),0),
                  tuple(tuple("1","4"),0),
                  tuple(tuple("3","6"),0),
                  tuple(tuple("5","4"),0),
                  tuple(tuple("6","2"),0),
                  tuple(tuple("6","5"),0)));

  public static Graph<String,Integer> caliDG =
          MapGraph.fromList(list(tuple(tuple("SanFrancisco", "SanRafael"), 18),
          tuple(tuple("SanFrancisco", "Oakland"), 12),
          tuple(tuple("SanFrancisco", "Pacifica"), 15),
          tuple(tuple("SanFrancisco", "SanMateo"), 20),
          tuple(tuple("SanRafael", "Richmond"), 15),
          tuple(tuple("SanRafael", "SanFrancisco"), 18),
          tuple(tuple("Richmond", "Oakland"), 15),
          tuple(tuple("Richmond", "SanRafael"), 15),
          tuple(tuple("Oakland", "Richmond"), 15),
          tuple(tuple("Oakland", "SanFrancisco"), 12),
          tuple(tuple("Oakland", "Hayward"), 20),
          tuple(tuple("SanMateo", "SanFrancisco"), 20),
          tuple(tuple("SanMateo", "HalfMoonBay"), 25),
          tuple(tuple("SanMateo", "Hayward"), 20),
          tuple(tuple("SanMateo", "PaloAlto"), 18),
          tuple(tuple("Hayward", "Oakland"), 20),
          tuple(tuple("Hayward", "SanMateo"), 20),
          tuple(tuple("Hayward", "Fremont"), 14),
          tuple(tuple("PaloAlto", "SanMateo"), 18),
          tuple(tuple("PaloAlto", "Fremont"), 15),
          tuple(tuple("PaloAlto", "SantaClara"), 10),
          tuple(tuple("Fremont", "Hayward"), 14),
          tuple(tuple("Fremont", "PaloAlto"), 15),
          tuple(tuple("Fremont", "SanJose"), 20),
          tuple(tuple("SanJose", "Fremont"), 20),
          tuple(tuple("SanJose", "SantaClara"), 15),
          tuple(tuple("SanJose", "Watsonville"), 60),
          tuple(tuple("SantaClara", "SanJose"), 15),
          tuple(tuple("SantaClara", "PaloAlto"), 10),
          tuple(tuple("SantaClara", "ScottsValley"), 35),
          tuple(tuple("ScottsValley", "SantaClara"), 35),
          tuple(tuple("ScottsValley", "SantaCruz"), 10),
          tuple(tuple("Watsonville", "SanJose"), 60),
          tuple(tuple("Watsonville", "SantaCruz"), 70),
          tuple(tuple("SantaCruz", "ScottsValley"), 10),
          tuple(tuple("SantaCruz", "Watsonville"), 70),
          tuple(tuple("SantaCruz", "HalfMoonBay"), 50),
          tuple(tuple("HalfMoonBay", "Pacifica"), 15),
          tuple(tuple("HalfMoonBay", "SanMateo"), 25),
          tuple(tuple("HalfMoonBay", "SantaCruz"), 50),
          tuple(tuple("Pacifica", "SanFrancisco"), 15),
          tuple(tuple("Pacifica", "HalfMoonBay"), 15)));

  public static Graph<String,Integer> brd  =
          MapGraph.fromList(list(tuple(tuple("Bonn", "Koeln"), 34),
          tuple(tuple("Bonn", "Frankfurt"), 181),
          tuple(tuple("Bonn", "Mannheim"), 224),
          tuple(tuple("Frankfurt", "Mannheim"), 88),
          tuple(tuple("Frankfurt", "Bonn"), 181),
          tuple(tuple("Frankfurt", "Giessen"), 66),
          tuple(tuple("Frankfurt", "Fulda"), 104),
          tuple(tuple("Frankfurt", "Wuerzburg"), 136),
          tuple(tuple("Fulda", "Wuerzburg"), 93),
          tuple(tuple("Fulda", "Frankfurt"), 104),
          tuple(tuple("Fulda", "Giessen"), 106),
          tuple(tuple("Fulda", "Kassel"), 96),
          tuple(tuple("Giessen", "Frankfurt"), 66),
          tuple(tuple("Giessen", "Marburg"), 30),
          tuple(tuple("Giessen", "Fulda"), 106),
          tuple(tuple("Giessen", "Koeln"), 174),
          tuple(tuple("Kassel", "Fulda"), 96),
          tuple(tuple("Kassel", "Marburg"), 104),
          tuple(tuple("Koeln", "Bonn"), 34),
          tuple(tuple("Koeln", "Giessen"), 174),
          tuple(tuple("Mannheim", "Bonn"), 224),
          tuple(tuple("Mannheim", "Frankfurt"), 88),
          tuple(tuple("Marburg", "Giessen"), 30),
          tuple(tuple("Marburg", "Kassel"), 104),
          tuple(tuple("Wuerzburg", "Frankfurt"), 136),
          tuple(tuple("Wuerzburg", "Fulda"), 93)));
}
