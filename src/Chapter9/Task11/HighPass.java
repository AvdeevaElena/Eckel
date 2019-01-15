package Chapter9.Task11;

public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }

}
