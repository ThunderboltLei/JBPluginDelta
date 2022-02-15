package com.pyramid.jbplugindelta.config;

import com.intellij.openapi.components.PersistentStateComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 插件配置服务
 * <p></p>
 *
 * @author: raymanlei
 * @date: 2022/2/14 14:38
 */
public class ConfigService implements PersistentStateComponent<Configs> {

    @Override
    public @Nullable Configs getState() {
        return null;
    }

    @Override
    public void loadState(@NotNull Configs state) {

    }

}
