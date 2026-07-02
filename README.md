# Tetranomicon - MCCDV NeoForge 1.21.1 迁移版

这是 `Tetranomicon` 的 MCCDV 服务器迁移分支，目标环境为：

- Minecraft `1.21.1`
- NeoForge `21.1.233`
- Java `21`
- Tetra `1.21.1-6.13.0`
- Mutil `1.21.1-6.3.1`

本仓库不是上游官方发布版本，而是为了 MCCDV S7 服务器将原本面向 Forge 1.20.1 的 Tetra 材料拓展附属迁移到 NeoForge 1.21.1 的适配版本。

## 当前状态

已完成的迁移工作：

- ForgeGradle 迁移到 `net.neoforged.moddev`。
- `mods.toml` 迁移到 `META-INF/neoforge.mods.toml`。
- Java 目标版本升级到 21。
- 物品注册迁移到 NeoForge `DeferredHolder`。
- hammer tier 注册迁移到当前 MCCDV Tetra port 中的 `HarvestTierRegistry`。
- Ores Above Diamonds / BetterNether 兼容注册做了 1.21.1 API 修正。
- 开发调试类已 stub，避免旧 Forge/Tetra 内部 API 影响运行时构建。
- 资源 JSON 已做语法解析检查。
- NeoForge import 已对照本地 `neoforge-21.1.233-universal.jar` 做存在性检查。

尚未完成或需要 GitHub Actions / 本地 Gradle 编译继续确认的事项：

- Tetra 数据格式的运行期加载结果仍需进测试服确认。
- 与其他材料拓展模组的实际物品/tag 对应关系需要在完整整合包环境里检查。

## 构建

使用 Java 21：

```bash
./gradlew --no-daemon build
```

Windows：

```powershell
.\gradlew.bat --no-daemon build
```

## Tetra / Mutil 依赖

本项目依赖 MCCDV 已迁移的 Tetra / Mutil jar。构建脚本会按以下顺序查找：

1. 当前仓库内：
   - `libs/tetra-1.21.1-6.13.0.jar`
   - `libs/mutil-1.21.1-6.3.1.jar`
2. 工作区相对路径：
   - `../../tetra-port/tetra/build/libs/tetra-1.21.1-6.13.0.jar`
   - `../../tetra-port/mutil/build/libs/mutil-1.21.1-6.3.1.jar`

如果把本项目单独作为 GitHub 仓库，建议将上述两个依赖 jar 放入 `libs/`，或者在 GitHub Actions 中先构建/下载 Tetra 与 Mutil。

## 开源协议

Tetranomicon 本体按 LGPL-3.0 发布，见：

- [LICENSE](./LICENSE)
- [Tetranomicon License.txt](./Tetranomicon%20License.txt)

仓库中少量来自 Tetra 的代码片段按 MIT 协议保留，见：

- [License for Tetra Code](./License%20for%20Tetra%20Code)

请保留 [NOTICE.md](./NOTICE.md)。

LGPL-3.0 的重点是：如果发布本迁移分支或其二进制 jar，应同时提供对应源码、保留许可证文本，并明确说明修改内容。不要把 Tetranomicon 重新声明成 MIT 或闭源项目。

## 免责声明

这是社区适配分支，不代表原作者或 Tetra 官方维护。用于服务器前请先在测试服验证启动、数据包加载、材料识别、替换规则和可锻造等级。
