package Week3.SnakeGame;

//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.*;
//import javafx.scene.canvas.*;
//import javafx.scene.paint.Color;
//import javafx.animation.AnimationTimer;
//import java.util.ArrayList;
//
//public class SnakeGame extends Application
//{
//    //Window & Snake Properties
//    private int width = 700;
//    private int height = 400;
//    private int size = 10;
//    private Snake snake = new Snake(size, size, size);
//    private Snack snack = new Snack(width, height, size);
//    private String direction = "RIGHT";
//    private String keyCode = "";
//
//
//
//    //Layout & Simulation objects
//    private Canvas canvas = new Canvas (width, height);
//    private GraphicsContext gc = canvas.getGraphicsContext2D();
//    private Group root = new Group();
//    private Scene scene = new Scene(root);
//    private Timer timer = new Timer(20);
//
//    @Override
//    public void start(Stage stage)
//    {
//        initialize(); //starts up our timer
//        this.root.getChildren().add(this.canvas);
//        stage.setScene(scene); //for our layout
//        stage.show();
//        stage.setTitle("Snake Game");
//
//    }
//    public void initialize()
//    {
//        timer.start(); //begins execution of handle method in Timer class
//
//        this.scene.setOnKeyPressed(e -> {
//            keyCode = e.getCode().toString();
//
//            if(keyCode.equals("RIGHT") && !direction.equals("LEFT"))
//                direction = "RIGHT";
//
//            if(keyCode.equals("LEFT") && !direction.equals("RIGHT"))
//                direction = "LEFT";
//
//            if(keyCode.equals("UP") && !direction.equals("DOWN"))
//                direction = "UP";
//
//            if(keyCode.equals("DOWN") && !direction.equals("UP"))
//                direction = "DOWN";
//
//        });
//    }
//
//    public void move() //drawing rectangles on our screen repeatedly
//    {
//        gc.setFill(Color.WHITE);
//        gc.fillRect(0,0,width,height); //Fill background white
//
//        ArrayList<Block> body = snake.getBody(); //get list of Blocks
//        for(Block b : body)
//        {
//            gc.setFill(Color.CRIMSON);
//            gc.fillRect(b.getX(), b.getY(), size, size);
//        }
//
//        int snackX = snack.getSnack().getX();
//        int snackY = snack.getSnack().getY();
//        gc.setFill(Color.RED);
//        gc.fillRect(snackX, snackY, size, size);
//
//        Block head = body.get(0);
//
//        if(head.getX() == snackX && head.getY () == snackY)
//        {
//            snake.ate(direction);
//        }
//        else {
//            snake.update(direction);
//        }
//
//        snake.update(direction);
//    }
//    class Timer extends AnimationTimer
//    {
//        private long FRAMES_PER_SECOND;
//        private long INTERVAL;
//        private long last = 0;
//
//        public Timer(int fps)
//        {
//            this.FRAMES_PER_SECOND = fps;
//            this.INTERVAL = 1000000000L/this.FRAMES_PER_SECOND;
//        }
//
//        @Override
//        public void handle(long now) //called every frame (now is in nanoseconds)
//        {
//            if(now - this.last > this.INTERVAL) //checks if some interval of time has passed
//            {
//                //Move the snake
//                move();
//                this.last = now;
//            }
//        }
//    }
//}


