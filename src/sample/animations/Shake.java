package sample.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;



// создаем анимации - пр неправильном вводе будем трясти окном
public class Shake {
    private TranslateTransition translateTransition;

    // ноде это объект который надо потрясти
    public Shake(Node node) {
        translateTransition = new TranslateTransition(Duration.millis(70), node);   // время тряски объекта
        translateTransition.setFromX(0f);           // отступ от икса
        translateTransition.setByX(10f);            // на сколько передвинется относительно нынешней позиции по иксу
        translateTransition.setCycleCount(3);       // как много раз он повторит тряску
        translateTransition.setAutoReverse(true);   // что бы не влияло перетаскивание окна
    }

    public void playAnim() {
        translateTransition.playFromStart();
    }
}
