package zg.critickal_modding.fachadas;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;

@SuppressWarnings("unchecked")
public class ComponentFachada {
    public static <T> Class<Ref<T>> tipoRef() {
        return (Class<Ref<T>>) (Class<?>) Ref.class;
    }
    public static <T> Class<Store<T>> tipoStore() {
        return (Class<Store<T>>) (Class<?>) Store.class;
    }
}
