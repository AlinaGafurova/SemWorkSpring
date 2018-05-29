package ru.kpfu.itis.gafurova.util.transformers;

import ru.kpfu.itis.gafurova.model.Studio;
import ru.kpfu.itis.gafurova.util.forms.StudioForm;

import java.util.function.Function;

public class StudioFormToStudioTransformer implements Function<StudioForm, Studio> {

    @Override
    public Studio apply(StudioForm studioForm) {
        Studio studio = new Studio();
        studio.setName(studioForm.getName());
        return studio;
    }
}
