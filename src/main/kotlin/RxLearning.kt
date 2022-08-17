import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit


fun main() {
    // emit single observable after a given delay
    // emit single observable after a given delay
    val timeObservable: Observable<Long> = Observable
        .interval(1, TimeUnit.SECONDS)

    timeObservable.subscribe {
        println("received $it")
    }

    Thread.sleep(3000)
}
