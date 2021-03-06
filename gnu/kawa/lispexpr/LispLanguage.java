package gnu.kawa.lispexpr;

import gnu.bytecode.Field;
import gnu.expr.ApplyExp;
import gnu.expr.BeginExp;
import gnu.expr.Compilation;
import gnu.expr.Declaration;
import gnu.expr.Expression;
import gnu.expr.Keyword;
import gnu.expr.Language;
import gnu.expr.ModuleExp;
import gnu.expr.NameLookup;
import gnu.kawa.reflect.StaticFieldLocation;
import gnu.mapping.EnvironmentKey;
import gnu.mapping.InPort;
import gnu.mapping.Namespace;
import gnu.mapping.Symbol;
import gnu.text.Lexer;
import gnu.text.SourceMessages;
import kawa.lang.Syntax;
import kawa.lang.Translator;

public abstract class LispLanguage extends Language {
    public static final Symbol bracket_apply_sym = Namespace.EmptyNamespace.getSymbol("$bracket-apply$");
    public static final Symbol bracket_list_sym = Namespace.EmptyNamespace.getSymbol("$bracket-list$");
    public static StaticFieldLocation getNamedPartLocation = new StaticFieldLocation("gnu.kawa.functions.GetNamedPart", "getNamedPart");
    public static final Symbol lookup_sym = Namespace.EmptyNamespace.getSymbol("$lookup$");
    public static final String quasiquote_sym = "quasiquote";
    public static final String quote_sym = "quote";
    public static final String unquote_sym = "unquote";
    public static final String unquotesplicing_sym = "unquote-splicing";
    public ReadTable defaultReadTable = createReadTable();

    public abstract ReadTable createReadTable();

    static {
        getNamedPartLocation.setProcedure();
    }

    public Lexer getLexer(InPort inp, SourceMessages messages) {
        return new LispReader(inp, messages);
    }

    public Compilation getCompilation(Lexer lexer, SourceMessages messages, NameLookup lexical) {
        return new Translator(this, messages, lexical);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r7.getMessages().seenErrors() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r0 = r4.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r0 < 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r0 == 13) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r0 != 10) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.skip();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parse(gnu.expr.Compilation r13, int r14) throws java.io.IOException, gnu.text.SyntaxException {
        /*
            r12 = this;
            r9 = 1
            r8 = 0
            r7 = r13
            kawa.lang.Translator r7 = (kawa.lang.Translator) r7
            gnu.text.Lexer r2 = r7.lexer
            gnu.expr.ModuleExp r3 = r7.mainLambda
            gnu.mapping.Values r1 = new gnu.mapping.Values
            r1.<init>()
            r4 = r2
            gnu.kawa.lispexpr.LispReader r4 = (gnu.kawa.lispexpr.LispReader) r4
            gnu.expr.Compilation r5 = gnu.expr.Compilation.setSaveCurrent(r7)
            java.lang.Object r10 = r7.pendingForm     // Catch:{ all -> 0x0074 }
            if (r10 == 0) goto L_0x0021
            java.lang.Object r10 = r7.pendingForm     // Catch:{ all -> 0x0074 }
            r7.scanForm(r10, r3)     // Catch:{ all -> 0x0074 }
            r10 = 0
            r7.pendingForm = r10     // Catch:{ all -> 0x0074 }
        L_0x0021:
            java.lang.Object r6 = r4.readCommand()     // Catch:{ all -> 0x0074 }
            java.lang.Object r10 = gnu.lists.Sequence.eofValue     // Catch:{ all -> 0x0074 }
            if (r6 != r10) goto L_0x0031
            r10 = r14 & 4
            if (r10 == 0) goto L_0x0050
            gnu.expr.Compilation.restoreCurrent(r5)
        L_0x0030:
            return r8
        L_0x0031:
            r7.scanForm(r6, r3)     // Catch:{ all -> 0x0074 }
            r10 = r14 & 4
            if (r10 == 0) goto L_0x0079
            gnu.text.SourceMessages r8 = r7.getMessages()     // Catch:{ all -> 0x0074 }
            boolean r8 = r8.seenErrors()     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x0050
        L_0x0042:
            int r0 = r4.peek()     // Catch:{ all -> 0x0074 }
            if (r0 < 0) goto L_0x0050
            r8 = 13
            if (r0 == r8) goto L_0x0050
            r8 = 10
            if (r0 != r8) goto L_0x0070
        L_0x0050:
            int r8 = r2.peek()     // Catch:{ all -> 0x0074 }
            r10 = 41
            if (r8 != r10) goto L_0x005d
            java.lang.String r8 = "An unexpected close paren was read."
            r2.fatal(r8)     // Catch:{ all -> 0x0074 }
        L_0x005d:
            r7.finishModule(r3)     // Catch:{ all -> 0x0074 }
            r8 = r14 & 8
            if (r8 != 0) goto L_0x0067
            r8 = 0
            r7.firstForm = r8     // Catch:{ all -> 0x0074 }
        L_0x0067:
            r8 = 4
            r7.setState(r8)     // Catch:{ all -> 0x0074 }
            gnu.expr.Compilation.restoreCurrent(r5)
            r8 = r9
            goto L_0x0030
        L_0x0070:
            r4.skip()     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x0074:
            r8 = move-exception
            gnu.expr.Compilation.restoreCurrent(r5)
            throw r8
        L_0x0079:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x0021
            int r10 = r7.getState()     // Catch:{ all -> 0x0074 }
            r11 = 2
            if (r10 < r11) goto L_0x0021
            gnu.expr.Compilation.restoreCurrent(r5)
            r8 = r9
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: gnu.kawa.lispexpr.LispLanguage.parse(gnu.expr.Compilation, int):boolean");
    }

    public void resolve(Compilation comp) {
        Translator tr = (Translator) comp;
        tr.resolveModule(tr.getModule());
    }

    public Declaration declFromField(ModuleExp mod, Object fvalue, Field fld) {
        Declaration fdecl = super.declFromField(mod, fvalue, fld);
        if (((fld.getModifiers() & 16) != 0) && (fvalue instanceof Syntax)) {
            fdecl.setSyntax();
        }
        return fdecl;
    }

    /* access modifiers changed from: protected */
    public void defSntxStFld(String name, String cname, String fname) {
        StaticFieldLocation.define(this.environ, this.environ.getSymbol(name), hasSeparateFunctionNamespace() ? EnvironmentKey.FUNCTION : null, cname, fname).setSyntax();
    }

    /* access modifiers changed from: protected */
    public void defSntxStFld(String name, String cname) {
        defSntxStFld(name, cname, Compilation.mangleNameIfNeeded(name));
    }

    public Expression makeBody(Expression[] exps) {
        return new BeginExp(exps);
    }

    public Expression makeApply(Expression func, Expression[] args) {
        return new ApplyExp(func, args);
    }

    public boolean selfEvaluatingSymbol(Object obj) {
        return obj instanceof Keyword;
    }

    public static Symbol langSymbolToSymbol(Object sym) {
        return ((LispLanguage) Language.getDefaultLanguage()).fromLangSymbol(sym);
    }

    /* access modifiers changed from: protected */
    public Symbol fromLangSymbol(Object sym) {
        if (sym instanceof String) {
            return getSymbol((String) sym);
        }
        return (Symbol) sym;
    }

    public Expression checkDefaultBinding(Symbol name, Translator tr) {
        return null;
    }
}
