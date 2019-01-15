package Chapter9.Task11;

public class LowPass extends Filter {

    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }

}
