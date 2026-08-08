package io.github.mooy1.infinitylib.common;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class CoolDowns {

    private final long coolDownTime;
    private final Map<UUID, Long> coolDowns = new HashMap<>();

    public CoolDowns(long coolDownTime) {
        this.coolDownTime = coolDownTime;
    }

    public boolean check(UUID uuid) {
        Long time = this.coolDowns.get(uuid);
        if (time == null || System.currentTimeMillis() - time > this.coolDownTime) {
            this.coolDowns.put(uuid, System.currentTimeMillis());
            return true;
        }
        return false;
    }

    public void reset(UUID uuid) {
        this.coolDowns.remove(uuid);
    }
}
