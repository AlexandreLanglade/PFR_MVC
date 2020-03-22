package view;

import control.ControlLancerIndexation;

/**
 * BoundaryLancerIndexation
 */
public class BoundaryLancerIndexation {

    private ControlLancerIndexation controlLancerIndexation;

    public BoundaryLancerIndexation(ControlLancerIndexation controlLancerIndexation) {
        this.controlLancerIndexation = controlLancerIndexation;
    }

    public void lancerIndexation() {
        if (controlLancerIndexation.verifierID()) {
            System.out.println("Indexation en cours ...");
            controlLancerIndexation.lancerIndexation();
            System.out.println("Indexation terminée.");
        }
    }
}