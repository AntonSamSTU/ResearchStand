package com.example.WebAppLabsSamGTU.zControllers;

import com.example.WebAppLabsSamGTU.model.Gazepoint;
import com.example.WebAppLabsSamGTU.model.Section;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Controller
public class MController {


    //username
    String username;

    List<Gazepoint> gazePoints = new ArrayList<>();

    List<TimeInterval> intervals;

    Section test1Section;
    List<Section> test1Requires;

    Section test2Section;
    List<Section> test2Requires;

    Section test3Section;
    List<Section> test3Requires;

    Section test4Section;
    List<Section> test4Requires;

    @GetMapping("/")
    public String startGet() {
        return "start";
    }

    @PostMapping("/start")
    public String startPost(@RequestParam String username) throws InterruptedException, IOException {
        this.username = username;
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("C:\\Users\\abug0122\\programms\\TobiiAppTest(1)\\TobiiAppTest\\bin\\Debug\\netcoreapp3.1\\TobiiAppTest.exe"));
        Thread.sleep(2000);
        return "redirect:/test1";
    }

    @GetMapping("/test1")
    public String test1Get() {
        test1Section = new Section();
        test1Section.setStartTime(System.currentTimeMillis());

        test1Requires = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test1Requires.add(new Section());
        }
        for (Section value :
                test1Requires) {
            value.setStartTime(System.currentTimeMillis());
        }
        return "test1";
    }

    @PostMapping("/stoptest1")
    public String test1Post(@RequestParam double fieldheight, @RequestParam double fieldwidth,
                            @RequestParam double fieldoX1, @RequestParam double fieldoY1, //working field

                            @RequestParam double height, @RequestParam double width, //required sections
                            @RequestParam double oX1, @RequestParam double oY1,
                            @RequestParam double oX2, @RequestParam double oY2,
                            @RequestParam double oX3, @RequestParam double oY3,
                            @RequestParam double oX4, @RequestParam double oY4,
                            @RequestParam double oX5, @RequestParam double oY5

    ) {
        test1Section.setEndTime(System.currentTimeMillis());
        test1Section.setHigh(fieldheight);
        test1Section.setWidth(fieldwidth);
        test1Section.setPeek_x(fieldoX1);
        test1Section.setPeek_y(fieldoY1);

        for (Section value :
                test1Requires) {
            value.setEndTime(System.currentTimeMillis());
            value.setHigh(height);
            value.setWidth(width);
        }
        test1Requires.get(0).setPeek_x(oX1);
        test1Requires.get(0).setPeek_y(oY1);
        test1Requires.get(1).setPeek_x(oX2);
        test1Requires.get(1).setPeek_y(oY2);
        test1Requires.get(2).setPeek_x(oX3);
        test1Requires.get(2).setPeek_y(oY3);
        test1Requires.get(3).setPeek_x(oX4);
        test1Requires.get(3).setPeek_y(oY4);
        test1Requires.get(4).setPeek_x(oX5);
        test1Requires.get(4).setPeek_y(oY5);

        return "redirect:/test2";
    }

    @GetMapping("/test2")
    public String test2Get() {
        test2Section = new Section();
        test2Section.setStartTime(System.currentTimeMillis());

        test2Requires = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test2Requires.add(new Section());
        }
        for (Section value :
                test2Requires) {
            value.setStartTime(System.currentTimeMillis());
        }

        return "test2";
    }

    @PostMapping("/stoptest2")
    public String test2Post(@RequestParam double fieldheight, @RequestParam double fieldwidth,
                            @RequestParam double fieldoX1, @RequestParam double fieldoY1, //working field

                            @RequestParam double height, @RequestParam double width, //required sections
                            @RequestParam double oX1, @RequestParam double oY1,
                            @RequestParam double oX2, @RequestParam double oY2,
                            @RequestParam double oX3, @RequestParam double oY3,
                            @RequestParam double oX4, @RequestParam double oY4,
                            @RequestParam double oX5, @RequestParam double oY5

    ) {
        test2Section.setEndTime(System.currentTimeMillis());
        test2Section.setHigh(fieldheight);
        test2Section.setWidth(fieldwidth);
        test2Section.setPeek_x(fieldoX1);
        test2Section.setPeek_y(fieldoY1);

        for (Section value :
                test2Requires) {
            value.setEndTime(System.currentTimeMillis());
            value.setHigh(height);
            value.setWidth(width);
        }
        test2Requires.get(0).setPeek_x(oX1);
        test2Requires.get(0).setPeek_y(oY1);
        test2Requires.get(1).setPeek_x(oX2);
        test2Requires.get(1).setPeek_y(oY2);
        test2Requires.get(2).setPeek_x(oX3);
        test2Requires.get(2).setPeek_y(oY3);
        test2Requires.get(3).setPeek_x(oX4);
        test2Requires.get(3).setPeek_y(oY4);
        test2Requires.get(4).setPeek_x(oX5);
        test2Requires.get(4).setPeek_y(oY5);
        return "redirect:/test3";
    }

    @GetMapping("/test3")
    public String test3Get() {
        test3Section = new Section();
        test3Section.setStartTime(System.currentTimeMillis());

        test3Requires = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test3Requires.add(new Section());
        }
        for (Section value :
                test3Requires) {
            value.setStartTime(System.currentTimeMillis());
        }
        return "test3";
    }

    @PostMapping("/stoptest3")
    public String test3Post(@RequestParam double fieldheight, @RequestParam double fieldwidth,
                            @RequestParam double fieldoX1, @RequestParam double fieldoY1, //working field

                            @RequestParam double height, @RequestParam double width, //required sections
                            @RequestParam double oX1, @RequestParam double oY1,
                            @RequestParam double oX2, @RequestParam double oY2,
                            @RequestParam double oX3, @RequestParam double oY3,
                            @RequestParam double oX4, @RequestParam double oY4,
                            @RequestParam double oX5, @RequestParam double oY5

    ) {
        test3Section.setEndTime(System.currentTimeMillis());
        test3Section.setHigh(fieldheight);
        test3Section.setWidth(fieldwidth);
        test3Section.setPeek_x(fieldoX1);
        test3Section.setPeek_y(fieldoY1);

        for (Section value :
                test3Requires) {
            value.setEndTime(System.currentTimeMillis());
            value.setHigh(height);
            value.setWidth(width);
        }
        test3Requires.get(0).setPeek_x(oX1);
        test3Requires.get(0).setPeek_y(oY1);
        test3Requires.get(1).setPeek_x(oX2);
        test3Requires.get(1).setPeek_y(oY2);
        test3Requires.get(2).setPeek_x(oX3);
        test3Requires.get(2).setPeek_y(oY3);
        test3Requires.get(3).setPeek_x(oX4);
        test3Requires.get(3).setPeek_y(oY4);
        test3Requires.get(4).setPeek_x(oX5);
        test3Requires.get(4).setPeek_y(oY5);

        return "redirect:/test4";
    }

    @GetMapping("/test4")
    public String test4Get() {
        test4Section = new Section();
        test4Section.setStartTime(System.currentTimeMillis());

        test4Requires = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test4Requires.add(new Section());
        }
        for (Section value :
                test4Requires) {
            value.setStartTime(System.currentTimeMillis());
        }
        return "test4";
    }

    @PostMapping("/stoptest4")
    public String test4Post(@RequestParam double fieldheight, @RequestParam double fieldwidth,
                            @RequestParam double fieldoX1, @RequestParam double fieldoY1, //working field

                            @RequestParam double height, @RequestParam double width, //required sections
                            @RequestParam double oX1, @RequestParam double oY1,
                            @RequestParam double oX2, @RequestParam double oY2,
                            @RequestParam double oX3, @RequestParam double oY3,
                            @RequestParam double oX4, @RequestParam double oY4,
                            @RequestParam double oX5, @RequestParam double oY5

    ) throws InterruptedException, IOException {
        test4Section.setEndTime(System.currentTimeMillis());
        test4Section.setHigh(fieldheight);
        test4Section.setWidth(fieldwidth);
        test4Section.setPeek_x(fieldoX1);
        test4Section.setPeek_y(fieldoY1);

        for (Section value :
                test4Requires) {
            value.setEndTime(System.currentTimeMillis());
            value.setHigh(height);
            value.setWidth(width);
        }
        test4Requires.get(0).setPeek_x(oX1);
        test4Requires.get(0).setPeek_y(oY1);
        test4Requires.get(1).setPeek_x(oX2);
        test4Requires.get(1).setPeek_y(oY2);
        test4Requires.get(2).setPeek_x(oX3);
        test4Requires.get(2).setPeek_y(oY3);
        test4Requires.get(3).setPeek_x(oX4);
        test4Requires.get(3).setPeek_y(oY4);
        test4Requires.get(4).setPeek_x(oX5);
        test4Requires.get(4).setPeek_y(oY5);

        stopNcalc();
        return "redirect:/";
    }

    //Method thats stop TobiiAppTest
    public void stopNcalc() throws InterruptedException, IOException {

        try {
            Runtime.getRuntime().exec("taskkill /IM \"TobiiAppTest.exe\" /F");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(1000);
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Test.txt"));
        while (reader.ready()) {

            String xString = reader.readLine();
            String yString = reader.readLine();
            String timeString = reader.readLine();
            if (xString != null && yString != null && timeString != null && timeString.length() == 13) {
                double x = Double.parseDouble(xString);
                double y = Double.parseDouble(yString);
                long time = Long.parseLong(timeString);
                gazePoints.add(new Gazepoint(x, y, time));
            }
        }
        gazePoints.sort(Comparator.comparing(Gazepoint::getTime));
        intervals = new ArrayList<>();
        for (int i = 1; i < gazePoints.size(); i++) {
            intervals.add(new TimeInterval(gazePoints.get(i - 1), gazePoints.get(i)));
        }
        FileWriter fileWriter = new FileWriter("result.txt", true);
        //Todo вычисления
        fileWriter.write("Username: " + username + "\n");
        fileWriter.write("Gazepoins size: " + gazePoints.size() + "\n");
        fileWriter.write("Time of tests: " + (test1Section.getEndTime() - test1Section.getStartTime() + test2Section.getEndTime() - test2Section.getStartTime()
                + test3Section.getEndTime() - test3Section.getStartTime() + test4Section.getEndTime() - test4Section.getStartTime()) + "\n" + "\n");
        fileWriter.write("test1 In field: " + checkGazepoints(test1Section, true) + "\n");
        fileWriter.write("test1 Outside field: " + checkGazepoints(test1Section, false) + "\n");
        fileWriter.write("test1 completion : " + (test1Section.getEndTime() - test1Section.getStartTime()) + "\n");
        long reqtime1 = 0;
        for (Section value :
                test1Requires) {
            reqtime1 += checkGazepoints(value, true);
        }
        fileWriter.write("test1 req: " + reqtime1 + "\n" + "\n");


        fileWriter.write("test2 In field: " + checkGazepoints(test2Section, true) + "\n");
        fileWriter.write("test2 Outside field: " + checkGazepoints(test2Section, false) + "\n");
        fileWriter.write("test2 completion : " + (test2Section.getEndTime() - test2Section.getStartTime()) + "\n");
        long reqtime2 = 0;
        for (Section value :
                test2Requires) {
            reqtime2 += checkGazepoints(value, true);
        }
        fileWriter.write("test2 req: " + reqtime2 + "\n" + "\n");


        fileWriter.write("test3 In field: " + checkGazepoints(test3Section, true) + "\n");
        fileWriter.write("test3 Outside field: " + checkGazepoints(test3Section, false) + "\n");
        fileWriter.write("test3 completion : " + (test3Section.getEndTime() - test3Section.getStartTime()) + "\n");
        long reqtime3 = 0;
        for (Section value :
                test3Requires) {
            reqtime3 += checkGazepoints(value, true);
        }
        fileWriter.write("test3 req: " + reqtime3 + "\n" + "\n");


        fileWriter.write("test4 In field: " + checkGazepoints(test4Section, true) + "\n");
        fileWriter.write("test4 Outside field: " + checkGazepoints(test4Section, false) + "\n");
        fileWriter.write("test4 completion : " + (test4Section.getEndTime() - test4Section.getStartTime()) + "\n");
        long reqtime4 = 0;
        for (Section value :
                test4Requires) {
            reqtime4 += checkGazepoints(value, true);
        }
        fileWriter.write("test4 req: " + reqtime4 + "\n");
        fileWriter.write("---------------------------------------------------------------------------------------" + "\n");
        fileWriter.close();
    }


    //Method thats count Time when person look at section
    public long checkGazepoints(Section section, boolean inSideSection) {

        long time = 0;

        for (TimeInterval interval : intervals) {
            boolean start;
            boolean end;
            if (inSideSection) {
                start = interval.start.isGazepointInSection(section);
                end = interval.end.isGazepointInSection(section);
            } else {
                start = interval.start.isGazepointOutsideSection(section);
                end = interval.end.isGazepointOutsideSection(section);
            }

            if (start && end) {
                time += interval.getTime();
            } else if (!start && end
                    || start && !end) {
                time += (interval.getTime() / 2);
            }
        }
        return time;
    }

    private class TimeInterval {
        Gazepoint start;
        Gazepoint end;

        public TimeInterval(Gazepoint start, Gazepoint end) {
            this.start = start;
            this.end = end;
        }

        public long getTime() {
            return end.getTime() - start.getTime();
        }
    }

}
