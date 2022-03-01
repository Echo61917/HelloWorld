package Week3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

    public class SnakeGame extends Application
    {
        //Layout & Simulation objects
        private Canvas canvas = new Canvas (700, 400);
        private GraphicsContext gc = canvas.getGraphicsContext2D();
        private Group root = new Group();
        private Scene scene = new Scene(root);
        private Timer timer = new Timer(25);

        @Override
        public void start(Stage stage)
        {
            initialize(); //starts up our timer
            confirmDirection();
            this.root.getChildren().add(this.canvas);
            stage.setScene(scene); //for our layout
            stage.show();
            stage.setTitle("Snake Game");

        }
        public void initialize()
        {
            timer.start(); //begins execution of handle method in Timer class
        }
        int x = 0;
        public void move() //drawing rectangles on our screen repeatedly
        {
            gc.setFill(Color.WHITE);
            gc.fillRect(0,0,700,400); //Fill background white

            gc.setFill(Color.CRIMSON);
            gc.fillRect(x,50,100,100); //fill snake or square crimson
            x++;
        }
        public void confirmDirection()
        {
            this.scene.setOnKeyPressed(e -> {
                String codeString = e.getCode().toString();
                System.out.println(codeString);
            });
        }
        class Timer extends AnimationTimer
        {
            private long FRAMES_PER_SECOND;
            private long INTERVAL;
            private long last = 0;

            public Timer(int fps)
            {
                this.FRAMES_PER_SECOND = fps;
                this.INTERVAL = 1000000000L/this.FRAMES_PER_SECOND;
            }

            @Override
            public void handle(long now) //called every frame (now is in nanoseconds)
            {
                if(now - this.last > this.INTERVAL) //checks if some interval of time has passed
                {
                    //Move the snake
                    move();
                    this.last = now;
                }
            }
        }
    }
