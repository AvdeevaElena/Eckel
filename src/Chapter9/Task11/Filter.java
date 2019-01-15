package Chapter9.Task11;

public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) { return input; }
}
